Feature: Login

Scenarios: Successfully Login with valid credentails


 Given user lunch chrome browser
 When user open the user "https://admin-demo.nopcommerce.com/login"
 And user enter email as "admin.yourstore.com" and password as "Admin"
 And Click on login
 Then Page titile should be "Dashboard / nopCommerce administration"
 When User click on logout button 
 Then page titile should be "Your store.login"
 And Close the browser 
