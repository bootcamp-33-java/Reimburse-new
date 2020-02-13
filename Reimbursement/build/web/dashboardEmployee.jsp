<%@page import="models.Vehicle"%>
<%@page import="models.ParkingLot"%>
<%@page import="java.util.List"%>
<%@page import="models.Reimburse"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
        <script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    </head>
     <% if (session.getAttribute("reimburses") == null ||  session.getAttribute("parkingLots") == null ||  session.getAttribute("vehicles") == null) {
            response.sendRedirect("register");
        } else {
            List<Reimburse> reimburses = (List<Reimburse>) session.getAttribute("reimburses");
            List<ParkingLot> parkingLots = (List<ParkingLot>) session.getAttribute("parkingLots");
            List<Vehicle> vehicles = (List<Vehicle>) session.getAttribute("vehicles");
    %>
    <body>

        <div data-role="page">
            <div data-role="header">
                <h1>Reimburse Form</h1>
            </div>

            <div data-role="main" class="ui-content">
                <form method="post" action="/action_page_post.php">
                    <fieldset data-role="collapsible">
                        <legend>Insert Data</legend>
                        <label for="name">Id :</label>
                        <input readonly="" type="text" placeholder="Auto Generate" name="id" id="name">
                        <label for="name">History :</label>
                        <input readonly="" type="text" placeholder="Auto Generate" name="history" id="name">
                        <label for="name">Ticket Photo's :</label>
                        <input  type="text"  name="ticket" id="name">
                        <label for="name">Date :</label>
                        <input  type="date"  name="date" id="name">
                        <label for="name">Price :</label>
                        <input  type="text"  name="price" id="name">
                        <label for="name">Employee:</label>
                        <input readonly="" type="text" placeholder="Auto Generate" name="employee" id="name">
                        <label for="name">Parking Lot :</label>
                        <input  type="text"  name="parking" id="name">
                        <p>Please select your vehicle:</p>
                        <input type="radio" id="motorcycle" name="motorcycle" value="male">
                        <label for="male">Motorcycle</label><br>
                        <input type="radio" id="car" name="car" value="female">
                        <label for="female">Car</label><br>
                        
                        
                        <label for="name">STNK Owner Name :</label>
                        <input  type="text" name="owner" id="name">
                        <label for="name">STNK Photo's :</label>
                        <input  type="text" name="stnk" id="name">

                        <input type="submit" data-inline="true" value="Submit">
                    </fieldset>
                </form>
            </div>
        </div>

    </body>
</html>
