# CSS - Quick Revision Notes

## 1. Short and Simple Definition
CSS stands for Cascading Style Sheets. It is used to style and design HTML elements like text, color, spacing, layout, and responsiveness.

## 2. Types and Their Definitions

### 1) Inline CSS
Inline CSS is written directly inside an HTML element using the `style` attribute.

Use case: Change the color of a single paragraph.

Syntax:
```html
<p style="color: red;">Hello</p>
```

### 2) Internal CSS
Internal CSS is written inside the `<style>` tag in the HTML file.

Use case: Style all paragraphs in one page.

Syntax:
```html
<style>
p {
  color: red;
}
</style>
```

### 3) External CSS
External CSS is written in a separate `.css` file and linked to HTML.

Use case: Keep styling separate and reusable across multiple pages.

Syntax:
```html
<link rel="stylesheet" href="style.css">
```

### 4) CSS Selectors
Selectors are used to choose which HTML element should be styled.

Use case: Apply a red color to all headings.

Syntax:
```css
h1 {
  color: red;
}
```

### 5) Class and ID
- Class is used for multiple elements.
- ID is used for a unique element.

Use case: Apply same style to multiple cards or one unique heading.

Syntax:
```css
.card {
  background: lightgray;
}

#title {
  color: blue;
}
```

## 3. Use Cases
- Change text color and font size
- Add spacing using margin and padding
- Build layouts using Flexbox and Grid
- Make websites responsive for mobile and tablet
- Add hover effects and animations

## 4. Syntax

### Basic CSS syntax
```css
selector {
  property: value;
}
```

### Example
```css
p {
  color: blue;
  font-size: 18px;
}
```

### Box model example
```css
.box {
  width: 200px;
  padding: 20px;
  border: 2px solid black;
  margin: 10px;
}
```

### Flexbox example
```css
.container {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 20px;
}
```

### Media query example
```css
@media (max-width: 768px) {
  .container {
    flex-direction: column;
  }
}
```

## 5. Real-Life Example
A company website uses CSS to make the header blue, text readable, buttons attractive, and the layout responsive on mobile.

```css
header {
  background-color: blue;
  color: white;
  padding: 20px;
}

button {
  background-color: orange;
  color: white;
  border: none;
  padding: 10px 20px;
}
```

## Quick Revision Points
- CSS = design and styling
- HTML = structure
- Selector chooses the element
- Class = reusable
- ID = unique
- Box model = content, padding, border, margin
- Flexbox = one-dimensional layout
- Grid = two-dimensional layout
- Media query = responsive design

## Important Things to Remember
- Inline CSS is used for quick styling.
- Internal CSS is used for one page.
- External CSS is best for large projects.
- `margin` is outside the element.
- `padding` is inside the element.
- Use `display: flex` for alignment and `display: grid` for layouts.
