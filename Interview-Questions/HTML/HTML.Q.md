 # HTML Interview Questions and Answers

## 1. What is semantic HTML, and why does it matter?

**Semantic HTML** means using HTML tags according to their meaning.

For example:

```html
<header>Website header</header>
<nav>Navigation links</nav>
<main>Main content</main>
<footer>Website footer</footer>
```

### Why is it important?

- **SEO:** Search engines understand the page structure more easily.
- **Accessibility:** Screen readers can understand and navigate the page better.
- **Readability:** Developers can understand the code quickly.

**Easy rule:** Use `<header>`, `<nav>`, `<main>`, `<section>`, and `<footer>` when their meaning matches the content. Use `<div>` only when no semantic tag is suitable.

---

## 2. What is the difference between block, inline, and inline-block elements?

| Type | Main behavior | Examples |
|---|---|---|
| **Block** | Starts on a new line and usually takes the full available width | `<div>`, `<p>`, `<h1>` |
| **Inline** | Stays on the same line and takes only the required width | `<span>`, `<a>`, `<strong>` |
| **Inline-block** | Stays on the same line but allows width and height | An element with `display: inline-block` |

### Example

```css
.box {
	display: inline-block;
	width: 150px;
	height: 50px;
}
```

**Easy way to remember:**

- Block = new line
- Inline = same line
- Inline-block = same line + width/height

---

## 3. What is the difference between `div` and `span`?

Both are **non-semantic containers**, but they are used differently.

- `<div>` is a **block-level** container. Use it to group larger sections.
- `<span>` is an **inline** container. Use it to style or group a small part of text.

### Example

```html
<div class="card">
	<h2>Product</h2>
	<p>This is a <span class="highlight">special</span> product.</p>
</div>
```

**Easy rule:** `div` groups a section; `span` groups words or small inline content.

---

## 4. What does the `alt` attribute do, and why is it required?

The `alt` attribute provides **alternative text** for an image.

```html
<img src="profile.jpg" alt="A profile photo of Rahul">
```

### Why is it important?

- Screen readers read the text to people who cannot see the image.
- It appears when the image cannot load.
- It helps explain the image's purpose.

For a decorative image, use an empty value:

```html
<img src="line.png" alt="">
```

**Easy rule:** Every meaningful image should describe its purpose in `alt`. Do not write unnecessary text such as `image of` because the screen reader already knows it is an image.

---

## 5. What is the difference between `id` and `class`?

| Feature | `id` | `class` |
|---|---|---|
| Use | Identifies one unique element | Groups multiple elements |
| Reuse | Should normally be used once per page | Can be used many times |
| CSS selector | `#header` | `.button` |
| JavaScript | `getElementById()` | `querySelectorAll()` or a class selector |

### Example

```html
<h1 id="page-title">My Page</h1>
<button class="button">Save</button>
<button class="button">Cancel</button>
```

**Easy rule:** `id` means one; `class` means many.

---

## 6. What are the main HTML5 form input types?

HTML5 provides input types that make forms easier and more useful.

```html
<input type="text">
<input type="email">
<input type="password">
<input type="number">
<input type="tel">
<input type="url">
<input type="date">
<input type="time">
<input type="file">
<input type="checkbox">
<input type="radio">
<input type="range">
<input type="color">
<input type="search">
```

### Common built-in validation attributes

- `required`: The field must not be empty.
- `minlength`: Sets the minimum number of characters.
- `maxlength`: Sets the maximum number of characters.
- `min`: Sets the minimum numeric or date value.
- `max`: Sets the maximum numeric or date value.
- `step`: Sets the allowed interval for numbers or dates.
- `pattern`: Requires the value to match a regular expression.
- `type="email"`: Checks for a valid email format.
- `type="url"`: Checks for a valid URL format.

### Example

```html
<form>
	<label for="email">Email:</label>
	<input
		id="email"
		name="email"
		type="email"
		required
		placeholder="you@example.com"
	>

	<label for="age">Age:</label>
	<input id="age" name="age" type="number" min="18" max="60" required>

	<button type="submit">Submit</button>
</form>
```

The browser checks these rules before submitting the form. This is called **client-side validation**. Server-side validation is still required for security.

**Easy memory line:** `required` checks presence, `min/max` check range, `minlength/maxlength` check length, and `type` checks format.

---

## Quick Revision

1. Semantic HTML gives meaning and improves SEO and accessibility.
2. Block starts a new line; inline stays in the line; inline-block does both inline flow and sizing.
3. `div` groups sections; `span` groups small inline content.
4. `alt` describes meaningful images for accessibility and failed image loading.
5. `id` is unique; `class` can be reused.
6. HTML5 input types and validation attributes help browsers validate form data.
