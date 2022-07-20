Feature: Validation of booking page in adactinhotel web application 

Scenario: TC01_Validation of booking page with valid inputs
  Given User launch adactinhotel web page
  When User enters valid username and valid password 
  And User clicks the login button and search hotel page should be opened
  When User select the location, hotel, room type,No.of Rooms,check in, check out date,adults count and child count
  And User clicks the search button and select hotel page should be opened 
  When User select the radio button
  And User clicks the continue button 
  When User enters first name,last name, billing address, credit card number,card type,expiry date and cvv number
  And User clicks Book now button and order number should be displayed     
     
 
 
