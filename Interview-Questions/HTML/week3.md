 # HTML/CSS Interview Questions 14-20

## 14. Flexbox vs Grid - when do you use which?

**Answer:** Flexbox is a one-dimensional layout system. It arranges items in a row or a column, so I use it for navigation bars, toolbars, button groups, and aligning content along one main axis.

Grid is a two-dimensional layout system. It controls rows and columns together, so I use it for page layouts, card grids, dashboards, galleries, and layouts where both horizontal and vertical placement matter.

For example, I would use Flexbox for the links inside a navbar and Grid for the overall portfolio sections or project-card layout. They are complementary, so a page can use both.

```css
.navbar {
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.projects {
	display: grid;
	grid-template-columns: repeat(3, 1fr);
	gap: 1rem;
}
```

---

## 15. Explain `justify-content` vs `align-items`. How do the axes change with `flex-direction`?

**Answer:** In Flexbox, `justify-content` aligns items along the **main axis**, while `align-items` aligns items along the **cross axis**.

- With `flex-direction: row`, the main axis is horizontal and the cross axis is vertical.
- With `flex-direction: column`, the main axis is vertical and the cross axis is horizontal.

Therefore, these properties are not permanently horizontal or vertical. Their direction depends on `flex-direction`.

```css
.container {
	display: flex;
	flex-direction: row;
	justify-content: center; /* horizontal main axis */
	align-items: center;     /* vertical cross axis */
}
```

If I change `flex-direction` to `column`, `justify-content` becomes vertical and `align-items` becomes horizontal.

`align-content` is different: it distributes multiple flex lines when wrapping is enabled; it does not align individual items on one line.

---

## 16. What does `flex: 1` actually mean?

**Answer:** `flex: 1` is shorthand that is commonly expanded by browsers as:

```css
flex-grow: 1;
flex-shrink: 1;
flex-basis: 0%;
```

It means the item can grow, can shrink, and starts with a zero flex basis. Available space is then distributed among flex items according to their grow factors. If sibling items also have `flex: 1`, they normally share the available space equally.

```css
.column {
	flex: 1;
}
```

One detail is that `flex: 1` is not always the same as `flex: 1 1 auto`; the basis changes how the initial size is calculated. I use the explicit three-value form when I need precise sizing behaviour.

---

## 17. What are media queries? What is mobile-first, and why is it preferred?

**Answer:** Media queries apply CSS only when a condition is true, such as viewport width, orientation, or user preference.

```css
@media (min-width: 768px) {
	.layout {
		grid-template-columns: 2fr 1fr;
	}
}
```

Mobile-first means writing the base CSS for small screens first and then adding enhancements for larger screens using `min-width` media queries.

It is preferred because it prioritises small screens, keeps the base CSS simpler, improves progressive enhancement, and reduces unnecessary overrides. Breakpoints should be chosen when the content needs more space, not only according to specific device names.

---

## 18. How do you centre a `div`? Give four ways.

**Answer:** The best method depends on whether I need to centre horizontally, vertically, or both. Four common methods are:

### 1. Flexbox

```css
.parent {
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
}
```

### 2. Grid

```css
.parent {
	display: grid;
	place-items: center;
	min-height: 100vh;
}
```

### 3. Auto margins for horizontal centring

```css
.child {
	width: 20rem;
	margin-inline: auto;
}
```

This centres a block horizontally when it has a constrained width. It does not vertically centre it by itself.

### 4. Absolute positioning with transform

```css
.parent {
	position: relative;
}

.child {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}
```

For normal layouts, I usually prefer Flexbox or Grid because they avoid taking the element out of normal document flow.

---

## 19. What is `fr` in Grid? What is the difference between `auto-fit` and `auto-fill`?

**Answer:** `fr` means a fraction of the available free space in a Grid container. For example, `1fr 2fr` divides the available space into three parts: one part for the first track and two parts for the second.

```css
.grid {
	display: grid;
	grid-template-columns: 1fr 2fr;
}
```

`auto-fill` creates as many tracks as can fit, including empty tracks. `auto-fit` also calculates as many tracks as can fit, but collapses empty tracks so existing items can expand.

```css
.cards {
	display: grid;
	grid-template-columns: repeat(auto-fit, minmax(15rem, 1fr));
	gap: 1rem;
}
```

For responsive card layouts, I commonly use `auto-fit` because the cards expand naturally when there are fewer items. I use `auto-fill` when preserving the track structure is useful even if some tracks are empty.

---

## 20. What makes a site responsive?

**Answer:** A responsive site adapts its layout, content, and controls to different screen sizes and input conditions. The main parts are:

1. **Viewport meta tag:**

	 ```html
	 <meta name="viewport" content="width=device-width, initial-scale=1.0">
	 ```

	 This makes the layout viewport match the device width.

2. **Fluid units:** Use `%`, `rem`, `em`, `vw`, `vh`, `fr`, `min()`, `max()`, or `clamp()` where appropriate instead of fixed widths everywhere.

3. **Flexible layouts:** Use Flexbox and Grid so content can wrap and rearrange.

4. **Media queries:** Change columns, spacing, typography, and navigation when the available space requires it.

5. **Flexible images and media:**

	 ```css
	 img {
		 display: block;
		 max-width: 100%;
		 height: auto;
	 }
	 ```

6. **Readable and usable content:** Prevent horizontal scrolling, keep text inside its container, provide usable touch targets, and preserve visible focus states.

I verify responsiveness at several widths, such as mobile, tablet, and desktop, and test both layout changes and actual usability rather than checking width alone.

---

## Quick interview summary

| Question | Key point |
|---|---|
| Flexbox vs Grid | Flexbox is one-dimensional; Grid is two-dimensional. |
| `justify-content` vs `align-items` | Main axis versus cross axis. |
| `flex: 1` | Usually `1 1 0%`: grow, shrink, zero basis. |
| Media queries | Conditional CSS for responsive conditions. |
| Mobile-first | Small-screen base styles, then `min-width` enhancements. |
| Four centring methods | Flexbox, Grid, auto margins, absolute + transform. |
| `fr` | Fraction of free Grid space. |
| `auto-fit` vs `auto-fill` | `auto-fit` collapses empty tracks; `auto-fill` preserves them. |
| Responsive site | Viewport meta, fluid units, flexible layout/media, media queries. |
