-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 15, 2017 at 10:03 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `colz_user`
--

-- --------------------------------------------------------

--
-- Table structure for table `1s`
--

CREATE TABLE `1s` (
  `id` int(6) UNSIGNED NOT NULL,
  `mobile_id` int(11) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1s`
--

INSERT INTO `1s` (`id`, `mobile_id`, `rating`) VALUES
(1, 20, 4),
(2, 1, 4),
(3, 13, 3),
(4, 7, 5),
(5, 14, 4),
(6, 2, 4),
(7, 5, 2);

-- --------------------------------------------------------

--
-- Table structure for table `2s`
--

CREATE TABLE `2s` (
  `id` int(6) UNSIGNED NOT NULL,
  `mobile_id` int(11) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2s`
--

INSERT INTO `2s` (`id`, `mobile_id`, `rating`) VALUES
(1, 1, 5),
(2, 6, 4),
(3, 7, 4),
(4, 8, 4),
(5, 10, 5);

-- --------------------------------------------------------

--
-- Table structure for table `3s`
--

CREATE TABLE `3s` (
  `id` int(6) UNSIGNED NOT NULL,
  `mobile_id` int(11) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `3s`
--

INSERT INTO `3s` (`id`, `mobile_id`, `rating`) VALUES
(1, 11, 3),
(2, 12, 3),
(3, 15, 4),
(4, 18, 3),
(5, 19, 4);

-- --------------------------------------------------------

--
-- Table structure for table `4s`
--

CREATE TABLE `4s` (
  `id` int(6) UNSIGNED NOT NULL,
  `mobile_id` int(11) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `4s`
--

INSERT INTO `4s` (`id`, `mobile_id`, `rating`) VALUES
(1, 1, 5),
(2, 8, 4),
(3, 15, 4),
(4, 16, 3),
(5, 20, 4),
(6, 2, 3);

-- --------------------------------------------------------

--
-- Table structure for table `5s`
--

CREATE TABLE `5s` (
  `id` int(6) UNSIGNED NOT NULL,
  `mobile_id` int(11) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `5s`
--

INSERT INTO `5s` (`id`, `mobile_id`, `rating`) VALUES
(1, 5, 3),
(2, 6, 3),
(3, 10, 3),
(4, 11, 4),
(5, 12, 4),
(6, 13, 4),
(7, 14, 3),
(8, 15, 3),
(9, 16, 5),
(10, 18, 2);

-- --------------------------------------------------------

--
-- Table structure for table `7s`
--

CREATE TABLE `7s` (
  `id` int(6) UNSIGNED NOT NULL,
  `mobile_id` int(11) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `7s`
--

INSERT INTO `7s` (`id`, `mobile_id`, `rating`) VALUES
(1, 14, 2),
(2, 15, 2),
(3, 17, 1),
(4, 18, 3),
(5, 19, 2);

-- --------------------------------------------------------

--
-- Table structure for table `8s`
--

CREATE TABLE `8s` (
  `id` int(6) UNSIGNED NOT NULL,
  `mobile_id` int(11) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `8s`
--

INSERT INTO `8s` (`id`, `mobile_id`, `rating`) VALUES
(2, 20, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `1s`
--
ALTER TABLE `1s`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `2s`
--
ALTER TABLE `2s`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `3s`
--
ALTER TABLE `3s`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `4s`
--
ALTER TABLE `4s`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `5s`
--
ALTER TABLE `5s`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `7s`
--
ALTER TABLE `7s`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `8s`
--
ALTER TABLE `8s`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `1s`
--
ALTER TABLE `1s`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `2s`
--
ALTER TABLE `2s`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `3s`
--
ALTER TABLE `3s`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `4s`
--
ALTER TABLE `4s`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `5s`
--
ALTER TABLE `5s`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `7s`
--
ALTER TABLE `7s`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `8s`
--
ALTER TABLE `8s`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
