INSERT INTO `pizza`.`roles` (`role_id`, `admin`, `customer`, `executor`, `role`) VALUES ('1', '1', '0', '0', 'ROLE_ADMIN');
INSERT INTO `pizza`.`roles` (`role_id`, `admin`, `customer`, `executor`, `role`) VALUES ('2', '0', '1', '0', 'ROLE_CUSTOMER');
INSERT INTO `pizza`.`roles` (`role_id`, `admin`, `customer`, `executor`, `role`) VALUES ('3', '0', '0', '1', 'ROLE_EXECUTOR');

INSERT INTO `pizza`.`users` (`user_id`, `role_id`, `user_first_name`, `user_last_name`, `user_login`, `user_password`) VALUES ('1', '1', 'admin', 'admin', 'admin', 'admin');
INSERT INTO `pizza`.`users` (`user_id`, `role_id`, `user_first_name`, `user_last_name`, `user_login`, `user_password`) VALUES ('2', '2', 'test1', 'test', 'test1', 'test1');
INSERT INTO `pizza`.`users` (`user_id`, `role_id`, `user_first_name`, `user_last_name`, `user_login`, `user_password`) VALUES ('3', '2', 'test2', 'test', 'test2', 'test2');

INSERT INTO `pizza`.`sushis` (`sushi_id`, `sushi_name`) VALUES ('1', 'Onagi-Maki');
INSERT INTO `pizza`.`sushis` (`sushi_id`, `sushi_name`) VALUES ('2', 'Philadelphiya');
INSERT INTO `pizza`.`sushis` (`sushi_id`, `sushi_name`) VALUES ('3', 'Russkie');

INSERT INTO `pizza`.`beverages` (`beverage_id`, `beverage_name`) VALUES ('1', '\"Kola\"');
INSERT INTO `pizza`.`beverages` (`beverage_id`, `beverage_name`) VALUES ('2', '\"Fanta\"');
INSERT INTO `pizza`.`beverages` (`beverage_id`, `beverage_name`) VALUES ('3', 'Coffee \"Barista\"');
INSERT INTO `pizza`.`beverages` (`beverage_id`, `beverage_name`) VALUES ('4', 'Green tea \"Ahmad\"');

INSERT INTO `pizza`.`souses` (`souse_id`, `souse_name`) VALUES ('1', '\"Yazyk drakona\"');
INSERT INTO `pizza`.`souses` (`souse_id`, `souse_name`) VALUES ('2', '\"Vostochnoe naslajdenie\"');
INSERT INTO `pizza`.`souses` (`souse_id`, `souse_name`) VALUES ('3', '\"Stolichniy\"');

INSERT INTO `pizza`.`pizzas` (`pizza_id`, `pizza_name`) VALUES ('1', '\"Margarita\"');
INSERT INTO `pizza`.`pizzas` (`pizza_id`, `pizza_name`) VALUES ('2', '\"Vylkan\"');
INSERT INTO `pizza`.`pizzas` (`pizza_id`, `pizza_name`) VALUES ('3', '\"Paperoni\"');

INSERT INTO `pizza`.`products` (`product_id`, `pizza_id`, `souse_id`, `beverage_id`, `sushi_id`) VALUES ('1', '2', '3', '2', '2');
INSERT INTO `pizza`.`products` (`product_id`, `pizza_id`, `souse_id`, `beverage_id`, `sushi_id`) VALUES ('2', '1', '1', '2', '3');
INSERT INTO `pizza`.`products` (`product_id`, `pizza_id`, `souse_id`, `beverage_id`, `sushi_id`) VALUES ('3', '3', '2', '3', '1');

INSERT INTO `pizza`.`offices` (`office_id`, `office_address`, `office_phone`, `office_comment`) VALUES ('1', 'yl. Meleja 4', '12345', 'Posle 14:00');
INSERT INTO `pizza`.`offices` (`office_id`, `office_address`, `office_phone`, `office_comment`) VALUES ('2', 'yl. Korolya 2', '54321', 'Posle 20:00');
INSERT INTO `pizza`.`offices` (`office_id`, `office_address`, `office_phone`, `office_comment`) VALUES ('3', 'yl. Bobryiskaya 8', '4567894', 'Do 15:00');

INSERT INTO `pizza`.`orders` (`order_id`, `order_date`, `order_time`, `user_id`, `product_id`, `office_id`) VALUES ('1', '15.02.2018', '15:00', '2', '2', '2');
INSERT INTO `pizza`.`orders` (`order_id`, `order_date`, `order_time`, `user_id`, `product_id`, `office_id`) VALUES ('2', '28.05.2018', '10:49', '2', '1', '3');
INSERT INTO `pizza`.`orders` (`order_id`, `order_date`, `order_time`, `user_id`, `product_id`, `office_id`) VALUES ('3', '20.04.2018', '22:30', '2', '3', '1');
INSERT INTO `pizza`.`orders` (`order_id`, `order_date`, `order_time`, `user_id`, `product_id`, `office_id`) VALUES ('4', '15.02.2018', '13:05', '2', '1', '1');

INSERT INTO `pizza`.`baskets` (`basket_id`, `quantity`, `order_id`) VALUES ('1', '2', '1');
INSERT INTO `pizza`.`baskets` (`basket_id`, `quantity`, `order_id`) VALUES ('2', '3', '2');
INSERT INTO `pizza`.`baskets` (`basket_id`, `quantity`, `order_id`) VALUES ('3', '1', '3');
INSERT INTO `pizza`.`baskets` (`basket_id`, `quantity`, `order_id`) VALUES ('4', '1', '4');




