-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Giu 15, 2023 alle 17:57
-- Versione del server: 10.4.27-MariaDB
-- Versione PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `artistaex`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `artista`
--

CREATE TABLE `artista` (
  `id` int(11) NOT NULL,
  `data_n` date DEFAULT NULL,
  `data_m` date DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_citta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `artista`
--

INSERT INTO `artista` (`id`, `data_n`, `data_m`, `nome`, `id_citta`) VALUES
(1, '1950-01-01', '2000-12-31', 'Leonardo da Vinci', 1),
(2, '1900-01-01', '1950-12-31', 'Pablo Picasso', 2),
(3, '1475-03-06', '1564-02-18', 'Michelangelo Buonarroti', 3),
(4, '1907-07-06', '1954-07-13', 'Frida Kahlo', 4),
(5, '1863-08-10', '1935-01-23', 'Henri Matisse', 5),
(6, '1840-03-30', '1926-12-05', 'Odilon Redon', 5),
(7, '1860-08-04', '1903-12-31', 'Henri Rousseau', 7),
(8, '1834-02-22', '1917-03-17', 'Edgar Degas', 5),
(9, '1864-12-14', '1901-12-29', 'Henri de Toulouse-Lautrec', 7),
(10, '1848-06-25', '1903-12-05', 'Paul Gauguin', 5),
(16, '2023-06-06', '2023-06-13', 'dfgfdg', 2);

-- --------------------------------------------------------

--
-- Struttura della tabella `citta`
--

CREATE TABLE `citta` (
  `id` int(11) NOT NULL,
  `cap` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `citta`
--

INSERT INTO `citta` (`id`, `cap`, `nome`) VALUES
(1, 20121, 'Vinci'),
(2, 8002, 'Malaga'),
(3, 50123, 'Firenze'),
(4, 6700, 'Città del Messico'),
(5, 6000, 'Parigi'),
(6, 92200, 'Laval'),
(7, 81503, 'Albi');

-- --------------------------------------------------------

--
-- Struttura della tabella `museo`
--

CREATE TABLE `museo` (
  `id` int(11) NOT NULL,
  `civico` int(11) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `telefono` int(11) NOT NULL,
  `via` varchar(255) DEFAULT NULL,
  `id_citta` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `museo`
--

INSERT INTO `museo` (`id`, `civico`, `nome`, `telefono`, `via`, `id_citta`) VALUES
(1, 1, 'Galleria degli Uffizi', 551234567, 'Piazzale degli Uffizi', 3),
(2, 12, 'Museo Picasso', 952123456, 'Calle San Agustín', 2),
(3, 23, 'Museo Frida Kahlo', 555789456, 'Calle Londres', 4),
(4, 45, 'Louvre Museum', 2147483647, 'Rue de Rivoli', 5),
(5, 67, 'Musée d\'Orsay', 2147483647, 'Rue de Lille', 6),
(6, 89, 'Musée des Beaux-Arts de Laval', 2147483647, 'Place de la Trémoille', 7),
(7, 101, 'Musée Toulouse-Lautrec', 2147483647, 'Palais de la Berbie', 1),
(8, 123, 'Musée de l\'Orangerie', 2147483647, 'Jardin Tuileries', 7);

-- --------------------------------------------------------

--
-- Struttura della tabella `opera`
--

CREATE TABLE `opera` (
  `id` int(11) NOT NULL,
  `valore` int(11) NOT NULL,
  `id_artista` int(11) DEFAULT NULL,
  `id_museo` int(11) DEFAULT NULL,
  `anno` int(11) NOT NULL,
  `titolo` varchar(255) NOT NULL,
  `img` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `opera`
--

INSERT INTO `opera` (`id`, `valore`, `id_artista`, `id_museo`, `anno`, `titolo`, `img`) VALUES
(1, 100000, 1, 1, 1503, 'La Gioconda', '/assets/Gioconda.jpg'),
(2, 5000000, 2, 2, 1907, 'Les Demoiselles d\'Avignon', '/assets/Demoiselles.jpg'),
(3, 1500000, 3, 3, 1940, 'Las Dos Fridas', '/assets/las-dos-fridas.jpg'),
(4, 80000000, 4, 4, 1506, 'Mona Lisa', '/assets/Gioconda.jpg'),
(5, 20000000, 5, 5, 1874, 'L\'Olympia', '/assets/Olympia.jpg'),
(6, 1000000, 6, 6, 1877, 'La Fileuse', '/assets/La-Fileuse.jpg'),
(7, 500000, 7, 7, 1891, 'Moulin de la Galette', '/assets/Moulin-de-la-Galette.jpg'),
(8, 40000000, 8, 8, 1916, 'Nymphéas', '/assets/Nymphéas.jpg'),
(9, 12000000, 9, 4, 1937, 'Sueño y Mentira de Franco', '/assets/Sueño-y-Mentira-de-Franco.jpg'),
(10, 300000, 10, 5, 1881, 'Le Déjeuner sur l\'herbe', '/assets/Le-Déjeuner-sur-l\'herbe.jpg');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `artista`
--
ALTER TABLE `artista`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4ml4aklqljibki9b6xs53mvqd` (`id_citta`);

--
-- Indici per le tabelle `citta`
--
ALTER TABLE `citta`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `museo`
--
ALTER TABLE `museo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKnt5gk0y9hcog83ameen8je3id` (`id_citta`);

--
-- Indici per le tabelle `opera`
--
ALTER TABLE `opera`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKnkwckepbdib6pubv5k0fdcbr1` (`id_artista`),
  ADD KEY `FKp41yk0vaot5j5kedsu320l71k` (`id_museo`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `artista`
--
ALTER TABLE `artista`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT per la tabella `citta`
--
ALTER TABLE `citta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT per la tabella `museo`
--
ALTER TABLE `museo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT per la tabella `opera`
--
ALTER TABLE `opera`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `artista`
--
ALTER TABLE `artista`
  ADD CONSTRAINT `FK4ml4aklqljibki9b6xs53mvqd` FOREIGN KEY (`id_citta`) REFERENCES `citta` (`id`);

--
-- Limiti per la tabella `museo`
--
ALTER TABLE `museo`
  ADD CONSTRAINT `FKnt5gk0y9hcog83ameen8je3id` FOREIGN KEY (`id_citta`) REFERENCES `citta` (`id`);

--
-- Limiti per la tabella `opera`
--
ALTER TABLE `opera`
  ADD CONSTRAINT `FKnkwckepbdib6pubv5k0fdcbr1` FOREIGN KEY (`id_artista`) REFERENCES `artista` (`id`),
  ADD CONSTRAINT `FKp41yk0vaot5j5kedsu320l71k` FOREIGN KEY (`id_museo`) REFERENCES `museo` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
