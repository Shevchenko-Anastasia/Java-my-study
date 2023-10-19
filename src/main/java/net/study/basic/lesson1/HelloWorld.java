package net.study.basic.lesson1;

import net.study.basic.lesson3.Person;

import java.util.Base64;
import javax.xml.bind.DatatypeConverter;

public class HelloWorld {

    public static void main(String[] args) {

        final byte [] rawBytes = DatatypeConverter.parseHexBinary("0000006600000004000000000000971600000139303900010133383035303836323734363100000000003232303732303131313735363030302b0001000000000424000568656c6c6f0381000b0100004b535f3132333435030200010003030005016174656b");
        final String content = Base64.getEncoder().encodeToString(rawBytes);
        System.out.println(content);



    }



}

