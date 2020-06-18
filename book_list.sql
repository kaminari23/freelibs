-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Июн 18 2020 г., 05:53
-- Версия сервера: 5.5.25
-- Версия PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `book_list`
--
CREATE DATABASE `book_list` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `book_list`;

-- --------------------------------------------------------

--
-- Структура таблицы `bag`
--

CREATE TABLE IF NOT EXISTS `bag` (
  `id` int(11) NOT NULL,
  `gid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `bag`
--

INSERT INTO `bag` (`id`, `gid`) VALUES
(1, 6),
(1, 1),
(1, 3),
(3, 1),
(3, 5),
(3, 2),
(1, 2),
(2, 8),
(4, 7);

-- --------------------------------------------------------

--
-- Структура таблицы `booklist`
--

CREATE TABLE IF NOT EXISTS `booklist` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `annotation` text NOT NULL,
  `author` varchar(50) NOT NULL,
  `picture` varchar(500) NOT NULL,
  `capacity` int(20) NOT NULL,
  `pubdate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Дамп данных таблицы `booklist`
--

INSERT INTO `booklist` (`id`, `name`, `annotation`, `author`, `picture`, `capacity`, `pubdate`) VALUES
(1, 'Неприкаянна душа', 'Герої, стародавні і не дуже. Всі вони діяли заради чогось. Були готові піти на ризик і навіть пожертвувати всім заради того, у що вірять. Вони будуть продовжувати бурити скелю, щоб досягти іншого боку - чи не це кличуть подвигом? Хоча часто хоробрість межує з безглуздям, про це ми швидше за все не дізнаємося з легенд. Сувора правда життя така, що в реальності цих "героїв" скоріше чекає доля Ікара. Але всі вони хоча б знають, заради чого роблять це. Але як сильна душа без забобонів буде шукати сенс, чи усвідомлює марність?', 'kaminari23', 'https://i.pinimg.com/originals/96/1d/60/961d60926edfb29d1f0707dd003d1501.jpg', 275000, '2020-05-19'),
(2, 'Rolling in the deep', 'Theres a fire starting in my heart', 'Skyfall', 'https://v1.popcornnews.ru/k2/news/970/upload/KvaDSl.jpg', 14785214, '2020-05-19'),
(3, 'Майстри меча онлайн 1 том', 'Айнкрад - велична фортеця в небесах. Під склепіння цієї фортеці прийшло безліч людей, щоб знайти друзів, спокій або бойову славу, кому-то були потрібні дорогі трофеї, а кому-то просто хотілося повеселитися.\nЦя фортеця - замкнутий віртуальний світ, що дає повну свободу дій, а також є ... смертельним "Колізеєм". Рівно десять тисяч чоловік, в прямому сенсі "хардкорних" геймерів, виявилися в пастці VRMMORPG, створеної Акіхіко каяба на основі технології "Повного занурення".\nВсі ці гравці виявилися в досить недвозначно положенні - якщо вмираєш в грі, то вмираєш і в реальному світі. Єдиний спосіб вижити - це ризикнути своїм життям і перемогти 100 ігрових Босів, що вражають своєю жорстокістю і силою, і пройти гру. Надії на порятунок ззовні немає.\nШанси вижити майже нульові.\nАле наш герой Кіріто, з тяжким усвідомленням своїх гріхів, продирається крізь кожен рівень, постійно межує між життям і "червоною зоною" хіт-поінтів.\nЧим же закінчиться ця танець зі смертю?', 'Рекі Кавахара', 'https://a.wattpad.com/cover/69128712-176-k753716.jpg', 0, '2020-06-15'),
(4, 'Життя номер два', 'Бояр-аніме + детектив в одному флаконі. В результаті суперечки ангела і диявола за душу раптово помер в нашому світі людини він отримує можливість прожити ще одне життя, на цей раз в іншому тілі і в іншому світі. У тілі п''ятнадцятирічного підлітка Альоші Левского, в світі, де є магія, де Альоша не аби хто, а член далеко не останньою боярської сім''ї. Здавалося б, треба тільки спочатку зайняти гідне місце в сім''ї, потім в роду, а там і весь світ в кишені, але ... Але не все так просто. Хлопчину, в тіло якого вселилася душа нашого сучасника, мало не вбили і продовжують робити замах на його життя. І замість підкорення світу перед ним стоять зовсім інші завдання - вжитися в нове життя, а головне - вижити. А для цього треба з''ясувати, хто ж стоїть за спробами його вбити ...', 'Казьмін Михайло Іванович', 'https://author.today/content/2020/05/21/4208aa29d4d14cf5af99270561f904fd.jpg?width=265&height=400&mode=max', 0, '2020-06-16');

-- --------------------------------------------------------

--
-- Структура таблицы `genres`
--

CREATE TABLE IF NOT EXISTS `genres` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `gname` varchar(25) NOT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- Дамп данных таблицы `genres`
--

INSERT INTO `genres` (`gid`, `gname`) VALUES
(1, 'Фэнтези'),
(2, 'Научная фантастика'),
(3, 'Драма'),
(4, 'Историческое'),
(5, 'Экшн'),
(6, 'Мрачное фэнтези'),
(7, 'Детектив'),
(8, 'Психология');

-- --------------------------------------------------------

--
-- Структура таблицы `userlib`
--

CREATE TABLE IF NOT EXISTS `userlib` (
  `uid` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(40) NOT NULL,
  `upass` varchar(20) NOT NULL,
  `urole` varchar(20) NOT NULL,
  `upicture` varchar(500) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`uid`, `uname`, `upass`, `urole`, `upicture`) VALUES
(1, 'abc', 'cba', '', ''),
(2, 'aaa', 'aaa', 'aaa', 'aaa'),
(3, 'ccc', 'ccc', 'USER', 'default'),
(4, 'kaminari23', 'zkeksbd4m', 'USER', 'default'),
(5, 'bbb', 'bbb', '', ''),
(6, 'eee', 'eee', 'default', 'USER'),
(7, 'ddd', 'ddd', 'default', 'USER'),
(8, 'fff', 'fff', 'default', 'USER');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
