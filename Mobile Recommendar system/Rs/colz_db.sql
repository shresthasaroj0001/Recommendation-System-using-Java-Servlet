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
-- Database: `colz_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `mobile_details`
--

CREATE TABLE `mobile_details` (
  `id` int(11) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `battery` int(11) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `displaysize` double NOT NULL,
  `platform` varchar(20) NOT NULL,
  `price` double NOT NULL,
  `ram` double NOT NULL,
  `photoid` varchar(50) DEFAULT NULL,
  `Description` text,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mobile_details`
--

INSERT INTO `mobile_details` (`id`, `Name`, `battery`, `brand`, `displaysize`, `platform`, `price`, `ram`, `photoid`, `Description`, `date`) VALUES
(1, 'iPhone 7', 2900, 'Apple', 4.7, 'IOS', 95500, 2, 'iPhone 7.jpg', '4.7 inches LED-backlit IPS LCD screen with a resolution of 750 x 1334 pixels\r\nApple A10 Fusion Quad-core 2.33 GHz CPU with Six-core GPU\r\n2GB RAM, 128GB internal storage with no microSD card slot\r\niOS 10.0.1\r\n12MP rear camera with phase detection autofocus, OIS and quad LED (dual-tone) flash light, 7MP front facing camera\r\nWi-Fi, bluetooth, touch ID, force touch, 4G LTE, 3G', '2016-09-11'),
(2, 'iPhone 6s', 1715, 'Apple', 4.7, 'IOS', 68000, 2, 'iPhone 6s.jpg', '12MP primary camera with auto focus, 4K video recording, flash and 5MP front facing camera\r\n11.4 centimeters (4.7-inch) retina HD 3D-touch capacitive touchscreen with 1334 x 750 pixels resolution and 326 ppi pixel density\r\nIOS v10 operating system with 1.84GHz A9 chip 64-bit architecture processor, 2GB RAM, 32GB internal memory and single nano SIM\r\n1715mAH lithium-ion battery providing talk-time of 14 hours on 3G networks and standby time of 240 hours', '2015-09-06'),
(5, 'iPhone SE', 1624, 'Apple', 4, 'IOS', 45000, 1, 'iPhone SE.jpg', 'iOS v9 operating system with A9 chip 64-bit architecture, embedded M9 motion coprocessor, 2GB RAM, 64GB internal memory and single nano SIM\r\nBuilt-in rechargeable lithium-ion battery providing talk-time of 14 hours on 3G and standby time of 12 hours on 3G networks, 13 hours on WiFi', '2015-09-06'),
(6, 'Samsung Galaxy J7 Pro', 3600, 'Samsung', 5.5, 'Android', 32000, 3, 'Samsung Galaxy J7 Pro.jpg', '5.5-inch full HD (1080p) Super AMOLED 2.5D curved glass display\r\nExynos processor\r\n1.6 GHz Octa-core CPU\r\n3GB RAM, 64GB Internal memory, \r\nExpandable memory up to 128GB with micro SD', '2017-07-01'),
(7, 'Samsung Galaxy S8+ ', 3000, 'Samsung', 6.2, 'Android', 89000, 4, 'Samsung Galaxy S8+ .jpg', 'Sensors	Iris scanner, fingerprint (rear-mounted), accelerometer, gyro, proximity, compass, barometer, heart rate, SpO2\r\nMessaging	SMS(threaded view), MMS, Email, Push Mail, IM\r\nBrowser	HTML5\r\nANT+ support\r\nS-Voice natural language commands and dictation\r\nMP4/DivX/XviD/H.265 player\r\nMP3/WAV/eAAC+/FLAC player\r\nPhoto/video editor\r\nDocument editor', '2017-05-01'),
(8, 'Samsung Galaxy S7 Edge ', 3600, 'Samsung', 5.5, 'Android', 68900, 4, 'Samsung Galaxy S7 Edge .jpg', 'Camera: 12MP rear camera with f1.7 aperture, phase detection autofocus, OIS and LED flash, 5MP front facing camera with f1.7 aperture\r\nConnectivity: Wi-Fi, Bluetooth v4.2, NFC, MicroUSB 2.0, 3G, 4G LTE, Hybrid Dual-SIM card slot\r\nOthers: Fingerprint sensor, IP68 certified â?? dust proof and water resistant over 1.5 meters for up to 30 minutes, fast charging, Wireless Charging', '2017-03-01'),
(10, 'Samsung Galaxy J5 ', 2400, 'Samsung', 5, 'Other', 21400, 2, 'Samsung Samsung Galaxy J5 .jpg', 'Sensors	Fingerprint (front-mounted), accelerometer, proximity\r\nMessaging	SMS(threaded view), MMS, Email, Push Mail, IM\r\nBrowser	HTML5', '2016-07-01'),
(11, 'Nokia 5', 3000, 'Nokia', 5, 'Android', 21350, 2, 'Nokia 5.jpg', 'Display Type:IPS LCD capacitive touchscreen, 16M colors\r\nOS:Android 7.1.1 (Nougat)\r\nChipset:Qualcomm MSM8937 Snapdragon 430\r\nMemory:16 GB, 2 GB RAM\r\nSensors:Fingerprint ', '2017-08-01'),
(12, 'Nokia 3', 2630, 'Nokia', 5, 'Android', 15650, 2, 'Nokia 3.jpg', 'Sensors	Accelerometer, gyro, proximity, compass\r\nMessaging	SMS(threaded view), MMS, Email, Push Mail, IM\r\nBrowser	HTML5', '2017-07-01'),
(13, 'Huawei GR5', 3340, 'Huwai', 5.5, 'Android', 34825, 4, 'Huawei GR5.jpg', 'Sensors:Fingerprint (rear-mounted), accelerometer, proximity, compass\r\nMessaging:SMS(threaded view), MMS, Email, Push Mail, IM\r\nBrowser:HTML5', '2017-03-01'),
(14, 'Huawei P10 Plus', 3450, 'Huwai', 5.5, 'Android', 76630, 4, 'Huawei P10 Plus.jpg', 'Sensors:Fingerprint (front-mounted), accelerometer, gyro, proximity, compass\r\nMessaging:SMS(threaded view), MMS, Email, Push Mail, IM', '2017-03-31'),
(15, 'Huawei Y7 Prime', 4000, 'Huwai', 5.5, 'Android', 24153, 3, 'Huawei Y7 Prime.jpg', 'Sensors	Fingerprint (rear-mounted), accelerometer, proximity, compass\r\nMessaging	SMS (threaded view), MMS, Email, Push Email', '2017-06-01'),
(16, 'Samsung Galaxy C9 Pro', 4000, 'Samsung', 6, 'Android', 47500, 6, 'Samsung Galaxy C9 Pro.jpg', 'Sensors Fingerprint (front-mounted), accelerometer, proximity, compass\r\nMessaging SMS(threaded view), MMS, Email, Push Mail, IM\r\nBrowser	HTML5', '2010-10-01'),
(17, 'Oppo F3', 31500, 'Others', 5.5, 'Android', 3200, 4, 'Oppo F3.jpg', 'Sensors:Fingerprint (front-mounted), accelerometer, gyro, proximity, compass\r\nMessaging:SMS (threaded view), MMS, Email, Push Email\r\nBrowser:HTML5', '2017-05-01'),
(18, 'Oppo F3 Plus', 4000, 'Others', 6, 'Android', 52160, 4, 'Oppo F3 Plus.jpg', 'Sensors:Fingerprint (front-mounted), accelerometer, gyro, proximity, compass\r\nMessaging:SMS (threaded view), MMS, Email, Push Email\r\nBrowser:HTML5\r\nJava:No', '2017-04-01'),
(19, 'Oppo A37F', 2630, 'Others', 5, 'Android', 15190, 2, 'Oppo A37F.jpg', 'Sensors	Accelerometer, proximity, compass\r\nMessaging SMS (threaded view), MMS, Email, Push Email\r\nBrowser	HTML5\r\nJava No', '2016-06-01'),
(20, 'Micromax Canvas ULTRA M1 ', 4000, 'Others', 5.5, 'Android', 21754, 3, 'Micromax Canvas ULTRA M1 .jpg', 'Android 6.0 Marshmallow\r\nFull metal body\r\n-fingerprint scanner on the rear', '2017-02-14'),
(21, 'iphone 8', 2900, 'Apple', 4.7, 'IOS', 100000, 2, 'a', '12Mp camera', '2017-09-12'),
(22, 'Iphone 8 plus', 2900, 'Apple', 5.5, 'IOS', 115000, 2, 'a', '', '2017-09-12'),
(23, 'iPhone X', 2900, 'Apple', 5.8, 'IOS', 120000, 2, 'a', '', '2017-09-13');

-- --------------------------------------------------------

--
-- Table structure for table `userlogin`
--

CREATE TABLE `userlogin` (
  `id` int(11) NOT NULL,
  `staff_id` varchar(30) NOT NULL,
  `staff_pwd` varchar(30) NOT NULL,
  `staff_first_name` varchar(20) NOT NULL,
  `staff_last_name` varchar(20) NOT NULL,
  `staff_middle_name` varchar(20) NOT NULL,
  `Registered_date` date NOT NULL,
  `table_name` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userlogin`
--

INSERT INTO `userlogin` (`id`, `staff_id`, `staff_pwd`, `staff_first_name`, `staff_last_name`, `staff_middle_name`, `Registered_date`, `table_name`) VALUES
(1, 'saroj', 'a', 'Saroj', 'Shrestha', '', '2017-09-04', '1s'),
(2, 'ram', 'r', 'Ram', 'Shrestha', 'Prasad', '2017-09-05', '2s'),
(3, 'ritesh', 'r', 'Ritesh', 'Shrestha', '', '2017-09-05', '3s'),
(4, 'ashma', 'a', 'Ashma', 'Shrestha', '', '2017-09-05', '4s'),
(5, 'hari', 'h', 'Hari', 'Humagai', 'Prasad', '2017-09-07', '5s'),
(7, 'shyam', 's', 'shyam', 's', '', '2017-09-09', '7s'),
(8, 'test', 't', 'test', 't', '', '2017-09-09', '8s');

-- --------------------------------------------------------

--
-- Table structure for table `vector_details`
--

CREATE TABLE `vector_details` (
  `id` int(11) NOT NULL,
  `battery` int(11) NOT NULL,
  `brand` int(11) NOT NULL,
  `displaysize` int(11) NOT NULL,
  `platform` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `ram` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vector_details`
--

INSERT INTO `vector_details` (`id`, `battery`, `brand`, `displaysize`, `platform`, `price`, `ram`) VALUES
(1, 2, 2, 2, 2, 5, 2),
(2, 1, 2, 2, 2, 5, 2),
(5, 1, 2, 1, 2, 4, 1),
(6, 3, 1, 4, 1, 4, 3),
(7, 3, 1, 5, 1, 5, 3),
(8, 3, 1, 3, 1, 5, 3),
(10, 2, 1, 3, 0, 3, 2),
(11, 3, 5, 3, 1, 3, 2),
(12, 2, 5, 3, 1, 2, 2),
(13, 3, 4, 4, 1, 4, 3),
(14, 3, 4, 4, 1, 5, 3),
(15, 4, 4, 4, 1, 3, 3),
(16, 4, 1, 5, 1, 4, 4),
(17, 4, 6, 4, 1, 1, 3),
(18, 4, 6, 5, 1, 5, 3),
(19, 2, 6, 3, 1, 2, 2),
(20, 4, 6, 4, 1, 3, 3),
(21, 4, 2, 2, 2, 5, 2),
(22, 4, 2, 4, 2, 5, 2),
(23, 2, 2, 4, 2, 5, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mobile_details`
--
ALTER TABLE `mobile_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userlogin`
--
ALTER TABLE `userlogin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vector_details`
--
ALTER TABLE `vector_details`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mobile_details`
--
ALTER TABLE `mobile_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `userlogin`
--
ALTER TABLE `userlogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
