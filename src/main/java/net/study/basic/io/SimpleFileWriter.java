package net.study.basic.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import static java.lang.String.*;
import static java.util.UUID.randomUUID;

public class SimpleFileWriter {

    public static void main(String[] args) throws IOException {

        final String file = "C:\\Users\\Admin\\test\\myTestArr.txt";

        final String pattern = "            \"%s\": [{\n" +
                "                    \"appCid\": \"%s\",\n" +
                "                    \"type\": \"MO\",\n" +
                "                    \"date\": \"2022-07-10T16:52:35\",\n" +
                "                    \"source\": \"380986643400\",\n" +
                "                    \"destination\": \"630\",\n" +
                "                    \"body\": \"test mo\",\n" +
                "                    \"appRespState\": \"N/A\"\n" +
                "                }, {\n" +
                "                    \"appCid\": \"%s\",\n" +
                "                    \"type\": \"DLR\",\n" +
                "                    \"date\": \"2022-07-10T16:52:38\",\n" +
                "                    \"source\": \"N/A\",\n" +
                "                    \"destination\": \"N/A\",\n" +
                "                    \"body\": \"N/A\",\n" +
                "                    \"appRespState\": \"0\"\n" +
                "                }, {\n" +
                "                    \"appCid\": \"%s\",\n" +
                "                    \"type\": \"MT\",\n" +
                "                    \"date\": \"2022-07-10T16:52:35\",\n" +
                "                    \"source\": \"630\",\n" +
                "                    \"destination\": \"380986643400\",\n" +
                "                    \"body\": \"1 Mij balans\\n2 Moi bonusy\\n3 Pro taryf\\n4 Poslugy\\n5 Rozvagy\",\n" +
                "                    \"appRespState\": \"N/A\"\n" +
                "                }\n" +
                "            ],";


        try (final FileWriter writer = new FileWriter(file);
             final BufferedWriter buffer = new BufferedWriter(writer)) {

            final int count = 7500;

            for (int i = 0; i < count; i++) {

                final String cid = randomUUID().toString();

                String nextVal = null;

                if ((count - 1) == i) {
                    final String result = format(pattern, cid, cid, cid, cid);
                    nextVal = result.substring(0, result.length() - 1);
                } else {
                    nextVal = format(pattern, cid, cid, cid, cid);
                }

                buffer.write(nextVal);
            }
        }

    }
}
