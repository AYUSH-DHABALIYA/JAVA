-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2024 at 02:12 PM
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
-- Database: `bank_details`
--

-- --------------------------------------------------------

--
-- Table structure for table `account_holder`
--

CREATE TABLE `account_holder` (
  `account_holder_id` int(11) DEFAULT NULL,
  `account_number` int(11) DEFAULT NULL,
  `acoount_holder_name` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `contact` int(11) DEFAULT NULL,
  `date_of_account_created` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `account_status` varchar(20) DEFAULT NULL,
  `account_type` varchar(20) DEFAULT NULL,
  `balance` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account_holder`
--

INSERT INTO `account_holder` (`account_holder_id`, `account_number`, `acoount_holder_name`, `city`, `contact`, `date_of_account_created`, `account_status`, `account_type`, `balance`) VALUES
(101, 111222333, 'A', 'Rajkot', 2147483647, '2024-02-08 12:06:23', 'Active', 'Saving', 100000),
(102, 444555666, 'B', 'Ahemdabad', 2147483647, '2024-02-08 12:06:23', 'Active', 'Saving', 150000),
(103, 777888999, 'C', 'Surat', 2147483647, '2024-02-08 12:06:23', 'Active', 'Saving', 200000);

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `branch_id` int(11) NOT NULL,
  `branch_name` varchar(50) DEFAULT NULL,
  `branch_city` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loan`
--

CREATE TABLE `loan` (
  `loan_no` int(11) DEFAULT NULL,
  `branch_id` int(11) DEFAULT NULL,
  `account_holder_id` int(11) DEFAULT NULL,
  `loan_amount` int(11) DEFAULT NULL,
  `loan_type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bank`
--
ALTER TABLE `bank`
  ADD PRIMARY KEY (`branch_id`);

--
-- Indexes for table `loan`
--
ALTER TABLE `loan`
  ADD KEY `branch_id` (`branch_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `loan`
--
ALTER TABLE `loan`
  ADD CONSTRAINT `loan_ibfk_1` FOREIGN KEY (`branch_id`) REFERENCES `bank` (`branch_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
