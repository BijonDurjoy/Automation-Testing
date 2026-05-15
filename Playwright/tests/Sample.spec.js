const { test, expect } = require("@playwright/test");

test("First test", async ({ page }) => {
  //
  expect(1).toBe(1);
});

test.skip("Second test", async ({ page }) => {
  //
  expect(1).toBe(2);
});

test("Third test", async ({ page }) => {
  //
  expect(1).toBe(1);
});

test("Forth Test", async ({ page }) => {
  expect("Bijon Saha Durjoy").toContain("Saha");
});
