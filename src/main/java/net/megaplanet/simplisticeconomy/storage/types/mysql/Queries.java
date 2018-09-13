package net.megaplanet.simplisticeconomy.storage.types.mysql;

class Queries {

    final static String CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS `%TABLE%` (\n" +
            "  `player` varchar(16) NOT NULL,\n" +
            "  `balance` double NOT NULL,\n" +
            "  PRIMARY KEY (`player`),\n" +
            "  UNIQUE KEY `player` (`player`)\n" +
            ") ENGINE=MyISAM DEFAULT CHARSET=latin1;\n";

    final static String INSERT = "INSERT INTO %TABLE% VALUES (?, ?)";
    final static String UPDATE_SET = "UPDATE %TABLE% SET balance=? WHERE player=?";
    final static String UPDATE_ADD = "UPDATE %TABLE% SET balance=balance+? WHERE player=?";
    final static String UPDATE_REMOVE = "UPDATE %TABLE% SET balance=balance-? WHERE player=?";
    final static String SELECT = "SELECT balance FROM %TABLE% WHERE player=?";
    final static String SELECT_TOP_10 = "SELECT * FROM %TABLE% ORDER BY balance DESC LIMIT 10";

}
