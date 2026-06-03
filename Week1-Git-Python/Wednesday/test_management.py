class TestCase:
    """Represents a single test case.

    Class Attributes:
        total_created (int): Count of all TestCase objects ever created

    Instance Attributes:
        name (str): Test name (e.g., "test_login_valid")
        description (str): What this test verifies
        priority (str): "high", "medium", or "low" (default: "medium")
        tags (list): Labels like ["smoke", "regression"]
    """
    # TODO: Implement __init__, run(), and a class method

    total_created = 0

    def __init__ (self, name, description, priority="medium", tags=None):
        self.name = name
        self.description = description
        self.priority = priority
        self.tags = tags

        if tags is None:
            self.tags = []
        else:
            self.tags = tags
        
        TestCase.total_created += 1

    def run(self):
        """Simulate running the test. Return True for pass, False for fail.
        For now, use: return "fail" not in self.name
        """
        return "fail" not in self.name

    @classmethod
    def from_dict(cls, data):
        """Create a TestCase from a dictionary.
        Example: TestCase.from_dict({"name": "test_login", "priority": "high"})
        """
        name = 
        description = 
        priority = 
        tags = 

        return cls(name, description, priority, tags)

    @staticmethod
    def is_valid_name(name):
        """Check if name starts with 'test_' and has no spaces."""
    
    starts_with_test = False
    if (len(name) >=5):
        if (name[0:4] == "test_"):
            starts_with_test = True
    if (starts_with_test & (" " in name)):
        return True
    else:
        return False

class TestResult:
    """The outcome of running a single test.

    Instance Attributes:
        test_name (str): Which test was run
        status (str): "pass" or "fail"
        duration_ms (float): How long it took
        error_message (str or None): Error details if failed
    """
    # TODO: Implement

    def summary(self):
        """Return a one-line summary like: '✅ test_login (120ms)'"""
        pass  # TODO

class TestRunner:
    """Executes a TestSuite and collects results.

    Methods:
        run(suite): Run all tests in a suite, return list of TestResult
        summary(results): Print a formatted summary
    """
    # TODO: Implement

    def run(self, suite):
        """Run each test in the suite and return a list of TestResults."""
        import time
        import random
        results = []
        for test in suite.tests:
            start = time.time()
            passed = test.run()
            duration = (time.time() - start) * 1000
            # Simulate varying duration
            duration += random.uniform(50, 500)
            result = TestResult(
                test.name,
                "pass" if passed else "fail",
                round(duration, 1),
                None if passed else f"{test.name} assertion failed"
            )
            results.append(result)
        return results

# if __name__ == "__main__":
