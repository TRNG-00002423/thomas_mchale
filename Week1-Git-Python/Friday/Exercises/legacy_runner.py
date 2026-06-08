"""
Legacy Test Runner — Uses print() everywhere.
YOUR TASK: Replace ALL print() calls with appropriate logging calls.

Import and use setup_logging() from logging_config.py.
"""

import time
import random
import logging
from logging.handlers import RotatingFileHandler

def setup_logging(log_file="test_framework.log", console_level=logging.INFO):
    """Configure and return the root logger for the framework.

    Args:
        log_file: Path to the log file
        console_level: Minimum level for console output

    Returns:
        logging.Logger configured with both handlers
    """
    # TODO: Create logger named "qa_framework"
    logger = logging.getLogger("qa_framework")
    logger.setLevel(logging.DEBUG)
    # TODO: Add StreamHandler for console (INFO+)
    console_handler = logging.StreamHandler()
    console_handler.setLevel(logging.INFO)
    # TODO: Add RotatingFileHandler for file (DEBUG+)
    file_handler = RotatingFileHandler(
        "test_framework.log",
        maxBytes=5_000_000,
        backupCount=3
    )
    file_handler.setLevel(logging.DEBUG)
    
    # TODO: Set appropriate formatters on each handler
    file_handler.setFormatter(logging.Formatter(
        "%(asctime)s | %(levelname)-8s | %(name)s:%(lineno)d | %(message)s"
    ))
    console_handler.setFormatter(logging.Formatter(
        "%(asctime)s | %(levelname)-8s | %(name)s:%(lineno)d | %(message)s"
    ))
    # TODO: Return the configured logger
    logger.addHandler(console_handler)
    logger.addHandler(file_handler)
    return logger

def run_test(test_name, logger):
    """Run a single test (simulated)."""
    logger.info(f"Running test: {test_name}")
    duration = random.uniform(0.1, 2.0)
    time.sleep(0.01)

    if random.random() < 0.2:
        logger.error(f"ERROR: {test_name} failed!")
        logger.info(f"  Duration: {duration:.2f}s")
        return False

    logger.info(f"  {test_name} passed ({duration:.2f}s)")
    return True


def run_suite(suite_name, test_names, logger):
    """Run a suite of tests."""
    logger.info(f"\n{'='*50}")
    logger.info(f"Starting suite: {suite_name}")
    logger.info(f"Tests to run: {len(test_names)}")
    logger.info(f"{'='*50}\n")

    results = {"passed": 0, "failed": 0}

    for i, test in enumerate(test_names, 1):
        logger.info(f"[{i}/{len(test_names)}]", end=" ")
        if run_test(test, logger):
            results["passed"] += 1
        else:
            results["failed"] += 1

    total = results["passed"] + results["failed"]
    rate = results["passed"] / total * 100

    logger.info(f"\n{'='*50}")
    logger.info(f"Results: {results['passed']}/{total} passed ({rate:.1f}%)")

    if rate < 80:
        logger.warning(f"WARNING: Pass rate below 80%!")
    if rate < 50:
        logger.critical(f"CRITICAL: More than half the tests failed!")

    return results


def main():
    logger = setup_logging()
    logger.info("QA Test Framework v1.0")
    logger.info("Initializing...")
    
    random.seed(42)

    suites = {
        "Smoke Tests": ["test_login", "test_homepage", "test_search"],
        "Regression": ["test_checkout", "test_payment", "test_profile",
                       "test_settings", "test_logout"],
        "Performance": ["test_load_page", "test_api_response"],
    }

    all_results = {"passed": 0, "failed": 0}

    for suite_name, tests in suites.items():
        try:
            result = run_suite(suite_name, tests, logger)
            all_results["passed"] += result["passed"]
            all_results["failed"] += result["failed"]
        except Exception as e:
            logger.error(f"Suite {suite_name} crashed: {e}", exc_info=True)

    total = all_results["passed"] + all_results["failed"]
    logger.info(f"\nFinal: {all_results['passed']}/{total} overall")


if __name__ == "__main__":
    main()