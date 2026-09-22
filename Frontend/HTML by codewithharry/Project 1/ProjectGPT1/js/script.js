
/* ==========================================
   SELECT ELEMENTS
========================================== */

const header = document.querySelector("header");

const searchInput = document.querySelector("#searchInput");

const searchButton = document.querySelector("#searchButton");

const suggestions = document.querySelector("#suggestions");


/* ==========================================
   HEADER SCROLL EFFECT
========================================== */

window.addEventListener("scroll", function () {

    if (window.scrollY > 50) {

        header.classList.add("scrolled");

    } else {

        header.classList.remove("scrolled");

    }

});


/* ==========================================
   SEARCH DATA
========================================== */

const searchItems = [
    "Pizza",
    "Burger",
    "Biryani",
    "Chinese Food",
    "South Indian",
    "North Indian",
    "Momos",
    "Pasta",
    "Desserts",
    "Cafe"
];


/* ==========================================
   SEARCH SUGGESTIONS
========================================== */

searchInput.addEventListener("input", function () {

    const value = searchInput.value
        .trim()
        .toLowerCase();


    suggestions.innerHTML = "";


    if (value === "") {

        suggestions.classList.remove("show");

        return;
    }


    const filteredItems = searchItems.filter(function (item) {

        return item.toLowerCase().includes(value);

    });


    if (filteredItems.length === 0) {

        suggestions.classList.remove("show");

        return;
    }


    filteredItems.forEach(function (item) {

        const div = document.createElement("div");

        div.classList.add("suggestion-item");

        div.textContent = item;


        div.addEventListener("click", function () {

            searchInput.value = item;

            suggestions.classList.remove("show");

        });


        suggestions.appendChild(div);

    });


    suggestions.classList.add("show");

});


/* ==========================================
   SEARCH BUTTON
========================================== */

searchButton.addEventListener("click", function () {

    performSearch();

});


/* ==========================================
   ENTER KEY SEARCH
========================================== */

searchInput.addEventListener("keydown", function (event) {

    if (event.key === "Enter") {

        performSearch();

    }

});


/* ==========================================
   SEARCH FUNCTION
========================================== */

function performSearch() {

    const searchValue = searchInput.value.trim();


    if (searchValue === "") {

        alert("Please search for a restaurant, cuisine or dish.");

        searchInput.focus();

        return;
    }


    alert("Searching for: " + searchValue);

}


/* ==========================================
   CLOSE SUGGESTIONS
   WHEN CLICKING OUTSIDE
========================================== */

document.addEventListener("click", function (event) {

    if (
        !searchInput.contains(event.target) &&
        !suggestions.contains(event.target)
    ) {

        suggestions.classList.remove("show");

    }

});


/* ==========================================
   SMOOTH SCROLL
========================================== */

document.querySelectorAll("a[href^='#']").forEach(function (link) {

    link.addEventListener("click", function (event) {

        const targetId = link.getAttribute("href");


        if (targetId === "#") {
            return;
        }


        const target = document.querySelector(targetId);


        if (target) {

            event.preventDefault();

            target.scrollIntoView({
                behavior: "smooth"
            });

        }

    });

});

