package databasewithtymleaf.database.querys;

public interface querys {
    String createBankAccount="" +
            "create table accounts(\n" +
            "    id serial primary key not null ,\n" +
            "    firstname varchar,\n" +
            "    lastname varchar,\n" +
            "    email varchar,\n" +
            "    gender varchar,\n" +
            "    phone varchar,\n" +
            "    address varchar,\n" +
            "    city varchar,\n" +
            "    birthdate date,\n" +
            "    pin int,\n" +
            "    password varchar,\n" +
            "    balance float\n" +
            ")";
    String createAdmins="" +
            "create table admins(\n" +
            "    id serial primary key not null,\n" +
            "    username varchar,\n" +
            "    password varchar\n" +
            ")";
}
