document.addEventListener("DOMContentLoaded", () => {
    const imgs = ["img1", "img2", "img3"];

    imgs.forEach((id, index) => {
        const el = document.getElementById(id);
        setTimeout(() => {
            el.style.opacity = "1";
        }, 400 + index * 300);
    });
});