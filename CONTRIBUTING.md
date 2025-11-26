# Contributing to CaseAPI

Thank you for your interest in contributing to this project. Contributions are welcome and appreciated. To keep the process secure, stable, and easy to manage, we ask that you follow the rules outlined below.

### 1. Use a personal GitHub account

All pull requests must be submitted from a personal GitHub account. Do not create a pull request from an organization repository.

This is a security measure.

### 2. Do not open PRs from or to main or dev

Pull requests must not be created from or targeting the `main` or `dev` branches. These are protected branches reserved for controlled integration and release.

Always use a separate branch in your fork to submit changes.

### 3. Use proper JavaDoc and no inline comments

Any new code must follow the existing documentation style.
Use JavaDoc for every method and class. Do not use inline comments in code.

Consistent documentation makes the code easier to maintain and understand.

### 4. Keep Pull Requests focused

Each pull request should cover a single logical change, such as a new feature, bug fix, or cleanup.
Avoid mixing unrelated changes in one PR. If you’re working on multiple features or issues, open a separate pull request for each.

### 5. Follow code style and structure

Stick to the established code style used throughout the project.
Do not auto-format files unnecessarily. Formatting-only changes will be rejected unless they are part of a larger fix.

Avoid using the `var` keyword unless it improves readability significantly and the type is obvious.

### 6. Test your changes before opening a PR

Ensure that:

- The project builds successfully.
- Your changes work.
- No existing features are broken.

If your code introduces new features or changes existing behavior, describe the impact clearly in your PR description.

### 7. Write clear commit messages

Commit messages should be short, consistent, and clearly describe what was changed.

Examples:

- Fix inventory not updating on reward open
- Add new reward animation for cases

For non-code commits (e.g., updating documentation), append `[ci skip]` to the end of the commit message to skip the automated build test.

### 8. Discuss before large changes

If you’re planning a major feature or significant refactor, begin a Discussion first about the idea before submitting a pull request.
This avoids unnecessary work in case the approach or scope is not aligned with the project goals.

### Summary

- Use a personal GitHub account for pull requests. No PRs from organizations.
- Never open PRs from or to the main or dev branches.
- Always use JavaDoc, never inline comments.
- Keep PRs focused, tested, and consistent with the existing code style.
- Discuss large changes before starting.