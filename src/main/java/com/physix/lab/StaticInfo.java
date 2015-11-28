package com.physix.lab;

public class StaticInfo {

    public static String logotype = "88888888ba  88                                88             88                     88           \n" +
            "88      \"8b 88                                \"\"             88                     88           \n" +
            "88      ,8P 88                                               88                     88           \n" +
            "88aaaaaa8P' 88,dPPYba,  8b       d8 ,adPPYba, 88 8b,     ,d8 88          ,adPPYYba, 88,dPPYba,   \n" +
            "88\"\"\"\"\"\"'   88P'    \"8a `8b     d8' I8[    \"\" 88  `Y8, ,8P'  88          \"\"     `Y8 88P'    \"8a  \n" +
            "88          88       88  `8b   d8'   `\"Y8ba,  88    )888(    88          ,adPPPPP88 88       d8  \n" +
            "88          88       88   `8b,d8'   aa    ]8I 88  ,d8\" \"8b,  88          88,    ,88 88b,   ,a8\"  \n" +
            "88          88       88     Y88'    `\"YbbdP\"' 88 8P'     `Y8 88888888888 `\"8bbdP\"Y8 8Y\"Ybbd8\"'   \n" +
            "                            d8'                                                                  \n" +
            "                           d8'                                                                 " ;

    public static String name = "PhysixLab";
    public static String version = "0.0.1";

    public static String info = name + " version: " + version;

    public static String generateInfoBox() {
            StringBuilder stringBuilder = new StringBuilder();
            int spaceLength = 5;
            int length = info.length() + 2 * spaceLength + 2;
            for(int i = 0; i < length; i++) {
                stringBuilder.append("=");
            }
            stringBuilder.append("\n");


            stringBuilder.append("|");
            for(int i = 0; i < length - 2; i++) {
                    stringBuilder.append(" ");
            }
            stringBuilder.append("|");
            stringBuilder.append("\n");


            stringBuilder.append("|");
            for(int i = 0; i < spaceLength; i++) {
                    stringBuilder.append(" ");
            }
            //for(int i = 0; i < length; i++) {
                    stringBuilder.append(info);
            //}
            for(int i = 0; i < spaceLength; i++) {
                    stringBuilder.append(" ");
            }
            stringBuilder.append("|");
            stringBuilder.append("\n");


            stringBuilder.append("|");
            for(int i = 0; i < length - 2; i++) {
                    stringBuilder.append(" ");
            }
            stringBuilder.append("|");
            stringBuilder.append("\n");


            for(int i = 0; i < length; i++) {
                    stringBuilder.append("=");
            }


            return stringBuilder.toString();


    }


}
