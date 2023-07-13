package com.cydeo.transactionTask;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        //1. Find all transactions in the year 2011 and sort them by value(small to high)

        List<Transaction> list =
                transactions.stream()
                        .filter(p -> p.getYear() == 2011)
                        .sorted(Comparator.comparing(Transaction::getValue))
                        .collect(Collectors.toList());

        System.out.println(list);

        System.out.println("------------");

        //2. What are all the unique cities where the traders work?

        List<String> uniqueCities =
                transactions.stream()
                        .map(p -> p.getTrader().getCity())
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(uniqueCities);

        System.out.println("------------");

        //3. Find all traders from Cambridge and sort them by name.

        List<Transaction> cambridgeTraders =
                transactions.stream()
                        .filter(p -> p.getTrader().getCity().equals("Cambridge"))
                        .sorted(Comparator.comparing(p -> p.getTrader().getName()))
                        .collect(Collectors.toList());

        System.out.println(cambridgeTraders);

        System.out.println("------------");

        //4. Return a string of all traders’ names sorted alphabetically.

        String allTraders =
                transactions.stream()
                        .map(p -> p.getTrader().getName())
                        .sorted()
                        .collect(Collectors.joining(", "));

        System.out.println(allTraders);

        System.out.println("------------");

        //5. Are any traders based in Milan?

        boolean anyMilanTrader =
                transactions.stream()
                        .anyMatch(p -> p.getTrader().getCity().equals("Milan"));

        System.out.println(anyMilanTrader);

        System.out.println("------------");

        //6. Print the values of all transactions from the traders living in Cambridge.

        transactions.stream()
                .filter(p -> p.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("------------");

        //7. What is the highest value of all the transactions?

        Integer highestValue =
        transactions.stream()
                .max( Comparator.comparing(Transaction::getValue) )
                .map(Transaction::getValue).get();

        System.out.println(highestValue);

        //8. Find the transaction with the smallest value.

        Optional<Transaction> lowestTransaction =
                transactions.stream()
                        .min( Comparator.comparing(Transaction::getValue) );

        System.out.println(lowestTransaction);

    }
}
