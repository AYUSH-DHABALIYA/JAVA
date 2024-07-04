-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2024 at 02:40 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sales_data`
--

-- --------------------------------------------------------

--
-- Table structure for table `item_mast`
--

CREATE TABLE `item_mast` (
  `pro_id` int(11) DEFAULT NULL,
  `pro_name` varchar(20) DEFAULT NULL,
  `pro_price` int(11) DEFAULT NULL,
  `pro_com` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `item_mast`
--

INSERT INTO `item_mast` (`pro_id`, `pro_name`, `pro_price`, `pro_com`) VALUES
(101, 'Mother Board', 3200, 15),
(102, 'Key Board', 450, 16),
(103, 'ZIP drive', 250, 14),
(104, 'Speaker', 550, 16),
(105, 'Monitor', 5000, 11),
(106, 'DVD drive', 900, 12),
(107, 'CD drive', 800, 12),
(108, 'Printer', 2600, 13),
(109, 'Refill cartridge', 350, 13),
(110, 'Mouse', 250, 12);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
