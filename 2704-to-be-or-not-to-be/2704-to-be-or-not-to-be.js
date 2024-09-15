var expect = function(val) {
    return {
        toBe: function(expected) {
            if (val === expected) {
                return true;
            } else {
                throw new Error("Not Equal");
            }
        },
        notToBe: function(expected) {
            if (val !== expected) {
                return true;
            } else {
                throw new Error("Equal");
            }
        }
    };
};

/**
 * Example usage:
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */

// Testing:
try {
    console.log(expect(5).toBe(5)); // true
} catch (error) {
    console.log(error.message);
}

try {
    console.log(expect(5).notToBe(5)); // Throws "Equal"
} catch (error) {
    console.log(error.message); // "Equal"
}
