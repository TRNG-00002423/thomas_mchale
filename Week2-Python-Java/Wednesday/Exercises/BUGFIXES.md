# Bug fixes (rename to BUGFIXES.md and fill in)

## Bug 1
- **Symptom:program crashes if given null input**
- **Root cause:missing null guard**
- **Fix:check if input is null before continuing**

## Bug 2
- **Symptom:incorrect return**
- **Root cause:the comparison that depermines the return is backwards**
- **Fix:flip the comkparison from < to >=**

## Bug 3
- **Symptom:incorrect return**
- **Root cause:integer division**
- **Fix:cast result to double before returning**

## Bug 4
- **Symptom:incorrect return**
- **Root cause:found index is never returned**
- **Fix:return found index**

## Bug 5
- **Symptom:program chrashes with out of bound**
- **Root cause:the loop is bound incorrectly**
- **Fix:fix the loop bound to be < then instead of <=**