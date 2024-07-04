-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2024 at 02:41 PM
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
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `ord_no` int(11) DEFAULT NULL,
  `purch_amt` int(11) DEFAULT NULL,
  `ord_date` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `salesman_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`ord_no`, `purch_amt`, `ord_date`, `customer_id`, `salesman_id`) VALUES
(70001, 151, 1997, 3005, 5002),
(70009, 271, 1993, 3001, 5005),
(70002, 65, 1997, 3002, 5001),
(70004, 111, 1987, 3009, 5003),
(70007, 949, 1993, 3005, 5002),
(70005, 2401, 1978, 3007, 5001),
(70008, 5760, 1993, 3002, 5001),
(70010, 1983, 1992, 3004, 5006),
(70003, 2480, 1992, 3009, 5003),
(70012, 250, 1979, 3008, 5002),
(70011, 75, 1987, 3003, 5007),
(70013, 3046, 1983, 3002, 5001);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
