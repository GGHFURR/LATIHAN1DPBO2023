<?php
require('temp.php'); //import temp.php

//deklar list
$list = array(
    new Temp("2106923", "Ghafur", "ilkom", "FPMIPA", "foto/ghafur.jpg"),
    new Temp("2106992", "Jhonny", "ilkom", "FPMIPA", "foto/johny.jpg"),
    new Temp("2106993", "Ryujin", "ilkom", "FPMIPA", "foto/ryujin.jpg")
);


//menampilkan data awal
echo "<h1> SHOW DATA AWAL </h1>";
echo "<table border=1>";
echo "<tr><th>NIM</th><th>Nama</th><th>Prodi</th><th>Fakultas</th><th>Foto</th></tr>";
//looping tampil data
foreach ($list as $listkeren) {
    echo "<tr>";
    echo "<td>" . $listkeren->getNim() . "</td>";
    echo "<td>" . $listkeren->getName() . "</td>";
    echo "<td>" . $listkeren->getProdi() . "</td>";
    echo "<td>" . $listkeren->getFakultas() . "</td>";
    echo '<td><img src="' . $listkeren->getFoto() . '" style="width:100px;"></td>';
    echo "</tr>";
}
echo "</table>";

//edit data 
$list[0]->setName("oppa Ghafur");

//menampilkan data edit
echo "<h1> SHOW DATA EDIT </h1>";
echo "<table border=1>";
echo "<tr><th>NIM</th><th>Nama</th><th>Prodi</th><th>Fakultas</th><th>Foto</th></tr>";
//looping tampil data
foreach ($list as $listkeren) {
    echo "<tr>";
    echo "<td>" . $listkeren->getNim() . "</td>";
    echo "<td>" . $listkeren->getName() . "</td>";
    echo "<td>" . $listkeren->getProdi() . "</td>";
    echo "<td>" . $listkeren->getFakultas() . "</td>";
    echo '<td><img src="' . $listkeren->getFoto() . '" style="width:100px;"></td>';
    echo "</tr>";
}
echo "</table>";
