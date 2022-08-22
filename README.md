# IfscNumberValidator
The application takes account number and IFSC code as input from user and uses Razorpay IFSC api to fetch bank details from the provided IFSC code.  

### Language and frameworks used
Java, Sring Boot, HTML

### Where to find Code?
* Controllers and Beans :- src > main > java > com.example.IfscNumberValidator
- Front-ent / HTML forms :- src > main > resources > templates

### Flow
0. Starts from hitting API "/customer" :- api sends the "customer.html" view. This is an html form that takes input from user.
1. Form takes input from user : Name, bank a/c number, ifsc code. Verifies if both a/c numbers match or not. If not, sends an alert that a/c num does not match.
2. Once the input fields are validated, form data is sent to api "/validate-ifsc".
3. This api/underlying-method takes the ifsc code from input, sends request to Razorpay api and returns JSON object. The object is then parsed into the "BankDetails" entity.
4. Upon completion, controller sends the view "BankResult.html" which shows the data fetched from Razorpay.
5. Output: 
* If IFSC code was incorrect, error mapping will be triggered with message that IFSC code is invalid.
- If IFSC code was correct, bank details will be visible to the user. If shown details are correct, user can exit, otherwise they can reset details and enter IFSC code again.
