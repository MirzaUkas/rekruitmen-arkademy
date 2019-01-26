<?php
$servername = "localhost"; // SERVERNAME ANDA
$username = "root"; // USERNAME ANDA
$password = ""; // PASSWORD ANDA
$dbname = "rekrutmendb"; // NAMA DB ANDA

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$countprod = "SELECT cat.id as id ,cat.name as namakat, count(p.category_id) as jumlah_product from product_categories AS cat left join products AS p on (cat.id = p.category_id) group by cat.id";
$showprod = "SELECT p.id as id,p.name as namaprod, c.name as namakat FROM products as p left join product_categories as c on (p.category_id = c.id)";
$result = $conn->query($countprod);
$result1 = $conn->query($showprod);
?>



<!DOCTYPE html>
<html lang="en">
<head>
  <title>Soal 7</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h1>SOAL 7</h1>
  <p>Menampilkan data Product dan Kategori.</p>
</div>
<div class="container">
  <h2>Product Category</h2>
  <p>Menghitung jumlah produk berdasarkan kategori</p>            
  <table class="table table-hover">
    <thead>
      <tr>
        <th>No</th>
        <th>Category Name</th>
        <th>Number of Products</th>
      </tr>
    </thead>
    <tbody>

    <?php
    if ($result->num_rows > 0) {
        // output data of each row
        while($row = $result->fetch_assoc()) {
            echo "<tr><td>".$row["id"]."</td><td>". $row["namakat"]."</td><td>". $row["jumlah_product"]."</td></tr>";
        }
    } else {
        echo "0 results";
    }
    $conn->close();
    
    ?>

    </tbody>
  </table>
</div>
<div class="container">
  <h2>All Product</h2>
  <p>Menampilkan semua produk disertai nama kategori</p>            
  <table class="table table-hover">
    <thead>
      <tr>
        <th>No</th>
        <th>Product Name</th>
        <th>Category Name</th>
      </tr>
    </thead>
    <tbody>

    <?php
    if ($result->num_rows > 0) {
        // output data of each row
        while($row = $result1->fetch_assoc()) {
            echo "<tr><td>".$row["id"]."</td><td>". $row["namaprod"]."</td><td>". $row["namakat"]."</td></tr>";
        }
    } else {
        echo "0 results";
    }
    // $conn->close();
    
    ?>

    </tbody>
  </table>
</div>
</body>
</html> 