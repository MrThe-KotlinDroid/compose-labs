# LabsApp - Jetpack Compose Workspace

This repository is my active workspace for learning native Android development using Jetpack Compose. I am using this project to build out various UI components and document the core concepts I learn along the way.

## Development Timeline

### [June 20, 2026] [1. Greeting Card](https://github.com/MrThe-KotlinDroid/compose-labs/blob/main/LabsApp/app/src/main/java/com/abrar/labsapp/ui/codelabs/GreetingCard.kt)
This is my introductory component to understand the absolute basics of the Jetpack Compose framework.
* **`@Composable` Annotation:** Learned how to define declarative UI functions.
* **`@Preview` Annotation:** Learned how to render and view the UI component directly inside Android Studio while coding, without needing to boot up a full emulator or device.

### [June 21, 2026] [2. Birthday Card](https://github.com/MrThe-KotlinDroid/compose-labs/blob/main/LabsApp/app/src/main/java/com/abrar/labsapp/ui/codelabs/BirthdayCard.kt)
This UI focuses on structuring basic layouts and formatting typography.
* **`Text` Composable:** Learned how to display and manipulate basic text on the screen.
* **Layouts (`Row` & `Column`):** Learned how to align and stack multiple UI components either horizontally or vertically.
* **Text Styling:** Adjusted text appearance, specifically targeting properties like `fontSize` and `lineHeight`.
* **Scale-independent Pixels (`sp`):** Learned why we use `sp` for text sizing instead of fixed pixels—it ensures the text scales dynamically if a user changes the global font size settings on their physical phone.

### [June 25, 2026] [3. Compose Article](https://github.com/MrThe-KotlinDroid/compose-labs/blob/main/LabsApp/app/src/main/java/com/abrar/labsapp/ui/codelabs/ComposeArticle.kt)
This UI is a practice exercise to build a standard article layout.
* **Images:** Learned how to import and display images using the `Image` composable.
* **String Resources & Padding:** Learned how to extract hardcoded text into the `strings.xml` file and reference it in the code using `stringResource()`. Also learned how to specify padding for individual sides (like `start` and `end`) rather than just applying it to `all` sides.
* **Text Alignment:** Used `TextAlign.Justify` to format paragraph text cleanly within its boundaries, understanding the difference between a text container's size and the screen size.

### [June 27, 2026] [4. Task Manager](https://github.com/MrThe-KotlinDroid/compose-labs/blob/main/LabsApp/app/src/main/java/com/abrar/labsapp/ui/codelabs/TaskManager.kt)
This component is a practice exercise to build a centered task completion screen.
* **Global Parent Alignment:** Learned how to utilize `horizontalAlignment = Alignment.CenterHorizontally` once on a parent `Column` container to instantly center all child elements, removing the need to apply alignments individually to each child.
* **Typography Weights:** Explored text styling further by introducing the `FontWeight.Bold` property to emphasize primary status text.

### [June 27, 2026] [5. Compose Quadrant](https://github.com/MrThe-KotlinDroid/compose-labs/blob/main/LabsApp/app/src/main/java/com/abrar/labsapp/ui/codelabs/ComposeQuadrant.kt)
This is the final practice component of the basic layouts section, focusing on building a perfectly symmetrical 4-box grid.
* **Proportional Space Distribution:** Learned how to use `Modifier.weight(1f)` to evenly divide available horizontal and vertical screen space among sibling `Row` and `Column` containers, allowing the layout to scale perfectly on any screen size without hardcoded pixel values.
* **The "Modifier Order" Rule:** Discovered that the sequence of modifiers completely changes the UI. Learned that `.background().padding()` fills the entire space with color before pushing the text inward, whereas `.padding().background()` pushes inward first, creating an uncolored margin around the box.
* **The "Use It Once" Rule (Modifier Propagation):** Learned a critical architectural rule: always pass the parameter `modifier` (lowercase) exclusively to the root/top-level parent container to respect external constraints, and always use a fresh `Modifier` (capitalized) for internal children to prevent double-applying spacing rules and breaking the layout.

### [June 29, 2026] [6. Business Card](https://github.com/MrThe-KotlinDroid/compose-labs/blob/main/LabsApp/app/src/main/java/com/abrar/labsapp/ui/codelabs/BusinessCard.kt)
This project wraps up the Compose basic layouts section by building a professional, multi-sectioned digital business card.
* **Composable Architecture:** Learned how to break down a complex UI into smaller, reusable functions (like `CardHeader` and `ContactRow`) to keep the code clean, readable, and highly maintainable.
* **Material Icons & Dependencies:** Discovered how to implement built-in Material Design icons (`ImageVector`), apply custom tint colors, and update the `build.gradle.kts` file to pull in the `material-icons-core` library.
* **Advanced Alignment & Spacing:** Mastered the interaction between `horizontalAlignment` (X-axis) and `verticalArrangement` (Y-axis) inside `Column` containers, and utilized weighted `Spacer` components to dynamically push UI blocks to the center and bottom of the screen.
* **Resource Extraction:** Applied Android industry best practices by extracting all hardcoded text into the `strings.xml` file using standard `snake_case` naming conventions (`profile_name`, `job_title`, etc.) to prepare the app for localization.