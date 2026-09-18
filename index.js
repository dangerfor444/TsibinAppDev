const EMAIL_PATTERN = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

function isValidEmail(email) {
    return EMAIL_PATTERN.test(email);
}

function printAppGreeting() {
    console.log("Hello, World!");
}

function printEmailValidationResults() {
    const samples = [
        { value: "test@example.com", expected: true },
        { value: "not-an-email", expected: false },
    ];

    samples.forEach(({ value, expected }) => {
        const received = isValidEmail(value);
        console.log(`Email "${value}" is valid: ${received}`);
        console.log(received === expected ? "PASS" : "FAIL");
    });
}

printAppGreeting();
printEmailValidationResults();