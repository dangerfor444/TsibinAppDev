console.log("Hello, World!");

function isValidEmail(email) {
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailPattern.test(email);
}

console.log(isValidEmail("test@example.com"));
console.log(isValidEmail("not-an-email"));