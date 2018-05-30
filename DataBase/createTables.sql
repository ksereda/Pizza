create database pizza;
use pizza;

CREATE TABLE `roles` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin` int(11) DEFAULT NULL,
  `customer` int(11) DEFAULT NULL,
  `executor` int(11) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `user_first_name` varchar(45) DEFAULT NULL,
  `user_last_name` varchar(45) DEFAULT NULL,
  `user_login` varchar(45) DEFAULT NULL,
  `user_password` varchar(45) DEFAULT NULL,
  `user_email` varchar(45) DEFAULT NULL,
  `user_phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `role_id_idx` (`role_id`),
  CONSTRAINT `role_id` FOREIGN KEY (`role_id`) REFERENCES `roles` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `pizzas` (
  `pizza_id` int(11) NOT NULL AUTO_INCREMENT,
  `pizza_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pizza_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `souses` (
  `souse_id` int(11) NOT NULL AUTO_INCREMENT,
  `souse_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`souse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `beverages` (
  `beverage_id` int(11) NOT NULL AUTO_INCREMENT,
  `beverage_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`beverage_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `sushis` (
  `sushi_id` int(11) NOT NULL AUTO_INCREMENT,
  `sushi_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sushi_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `products` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `pizza_id` int(11) DEFAULT NULL,
  `souse_id` int(11) DEFAULT NULL,
  `beverage_id` int(11) DEFAULT NULL,
  `sushi_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `pizza_id_idx` (`pizza_id`),
  KEY `souse_id_idx` (`souse_id`),
  KEY `beverage_id_idx` (`beverage_id`),
  KEY `sushi_id_idx` (`sushi_id`),
  CONSTRAINT `beverage_id` FOREIGN KEY (`beverage_id`) REFERENCES `beverages` (`beverage_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `pizza_id` FOREIGN KEY (`pizza_id`) REFERENCES `pizzas` (`pizza_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `souse_id` FOREIGN KEY (`souse_id`) REFERENCES `souses` (`souse_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `sushi_id` FOREIGN KEY (`sushi_id`) REFERENCES `sushis` (`sushi_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `offices` (
  `office_id` int(11) NOT NULL,
  `office_address` varchar(800) DEFAULT NULL,
  `office_phone` varchar(800) DEFAULT NULL,
  `office_comment` varchar(800) DEFAULT NULL,
  PRIMARY KEY (`office_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `baskets` (
  `basket_id` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`basket_id`),
  KEY `order_id_idx` (`order_id`),
  CONSTRAINT `order_id` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL,
  `order_date` datetime DEFAULT NULL,
  `order_time` datetime DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `office_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `product_id_idx` (`product_id`),
  KEY `office_id_idx` (`office_id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `office_id` FOREIGN KEY (`office_id`) REFERENCES `offices` (`office_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `product_id` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
