const { test, expect } = require("@playwright/test");

test("Verify application tytle", async ({ page }) => {
  await page.goto("https://www.google.com/");

  const url = page.url();
  console.log(url);

  const title = await page.title();
  console.log(title);

  await expect(page).toHaveTitle("Google");
});
