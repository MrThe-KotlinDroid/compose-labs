# LabsApp - Jetpack Compose Workspace

This repository is my active workspace for learning native Android development using Jetpack Compose. I am using this project to build out various UI components and document the core concepts I learn along the way.

## Development Timeline

### [June 20, 2026] 1. GreetingCard
This is my introductory component to understand the absolute basics of the Jetpack Compose framework.
* **`@Composable` Annotation:** Learned how to define declarative UI functions.
* **`@Preview` Annotation:** Learned how to render and view the UI component directly inside Android Studio while coding, without needing to boot up a full emulator or device.

### [June 21, 2026] 2. BirthdayCard
This UI focuses on structuring basic layouts and formatting typography.
* **`Text` Composable:** Learned how to display and manipulate basic text on the screen.
* **Layouts (`Row` & `Column`):** Learned how to align and stack multiple UI components either horizontally or vertically.
* **Text Styling:** Adjusted text appearance, specifically targeting properties like `fontSize` and `lineHeight`.
* **Scale-independent Pixels (`sp`):** Learned why we use `sp` for text sizing instead of fixed pixels—it ensures the text scales dynamically if a user changes the global font size settings on their physical phone.

### [June 25, 2026] 3. Compose Article
This UI is a practice exercise to build a standard article layout.
* **Images:** Learned how to import and display images using the `Image` composable.
* **String Resources & Padding:** Learned how to extract hardcoded text into the `strings.xml` file and reference it in the code using `stringResource()`. Also learned how to specify padding for individual sides (like `start` and `end`) rather than just applying it to `all` sides.
* **Text Alignment:** Used `TextAlign.Justify` to format paragraph text cleanly within its boundaries, understanding the difference between a text container's size and the screen size.

### [June 27, 2026] 4. Task Manager
This component is a practice exercise to build a centered task completion screen.
* **Global Parent Alignment:** Learned how to utilize `horizontalAlignment = Alignment.CenterHorizontally` once on a parent `Column` container to instantly center all child elements, removing the need to apply alignments individually to each child.
* **Typography Weights:** Explored text styling further by introducing the `FontWeight.Bold` property to emphasize primary status text.