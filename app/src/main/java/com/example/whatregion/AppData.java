package com.example.whatregion;

import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AppData {
    private static final String JSON_NAME = "JSON_NAME";
    private static final String SHARED_PREF = "SHARED_PREF";

    public static final String REGION_NUMBER = "REGION_NUMBER";
    public static final String REGION_NAME = "REGION_NAME";
    public static final String REGION_LAT = "REGION_LAT";
    public static final String REGION_LON = "REGION_LON";

    private static final String JsonData = "[\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"02\",\n" +
            "    \"REGION_NAME\": \"Республика Башкортостан\",\n" +
            "    \"REGION_LAT\": 52.3735,\n" +
            "    \"REGION_LON\": 56.3431\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"01\",\n" +
            "    \"REGION_NAME\": \"Республика Адыгея\",\n" +
            "    \"REGION_LAT\": 44.558,\n" +
            "    \"REGION_LON\": 40.099\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"102\",\n" +
            "    \"REGION_NAME\": \"Республика Башкортостан\",\n" +
            "    \"REGION_LAT\": 52.3735,\n" +
            "    \"REGION_LON\": 56.3431\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"03\",\n" +
            "    \"REGION_NAME\": \"Республика Бурятия\",\n" +
            "    \"REGION_LAT\": 51.819,\n" +
            "    \"REGION_LON\": 106.784\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"04\",\n" +
            "    \"REGION_NAME\": \"Республика Алтай\",\n" +
            "    \"REGION_LAT\": 50.648,\n" +
            "    \"REGION_LON\": 86.887\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"05\",\n" +
            "    \"REGION_NAME\": \"Республика Дагестан\",\n" +
            "    \"REGION_LAT\": 42.973,\n" +
            "    \"REGION_LON\": 47.249\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"06\",\n" +
            "    \"REGION_NAME\": \"Республика Ингушетия\",\n" +
            "    \"REGION_LAT\": 43.199,\n" +
            "    \"REGION_LON\": 44.95\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"07\",\n" +
            "    \"REGION_NAME\": \"Кабардино-Балкария\",\n" +
            "    \"REGION_LAT\": 43.493,\n" +
            "    \"REGION_LON\": 43.398\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"08\",\n" +
            "    \"REGION_NAME\": \"Республика Калмыкия\",\n" +
            "    \"REGION_LAT\": 46.385,\n" +
            "    \"REGION_LON\": 45.507\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"09\",\n" +
            "    \"REGION_NAME\": \"Карачаево-Черкесия\",\n" +
            "    \"REGION_LAT\": 43.796,\n" +
            "    \"REGION_LON\": 41.518\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"10\",\n" +
            "    \"REGION_NAME\": \"Республика Карелия\",\n" +
            "    \"REGION_LAT\": 63.578,\n" +
            "    \"REGION_LON\": 33.301\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"11\",\n" +
            "    \"REGION_NAME\": \"Республика Коми\",\n" +
            "    \"REGION_LAT\": 63.466,\n" +
            "    \"REGION_LON\": 53.218\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"12\",\n" +
            "    \"REGION_NAME\": \"Республика Марий Эл\",\n" +
            "    \"REGION_LAT\": 56.578,\n" +
            "    \"REGION_LON\": 47.885\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"13\",\n" +
            "    \"REGION_NAME\": \"Республика Мордовия\",\n" +
            "    \"REGION_LAT\": 54.199,\n" +
            "    \"REGION_LON\": 45.016\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"113\",\n" +
            "    \"REGION_NAME\": \"Республика Мордовия\",\n" +
            "    \"REGION_LAT\": 54.199,\n" +
            "    \"REGION_LON\": 45.016\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"14\",\n" +
            "    \"REGION_NAME\": \"Республика Саха(Якутия)\",\n" +
            "    \"REGION_LAT\": 62.069,\n" +
            "    \"REGION_LON\": 129.625\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"15\",\n" +
            "    \"REGION_NAME\": \"Северная Осетия - Алания\",\n" +
            "    \"REGION_LAT\": 43.051,\n" +
            "    \"REGION_LON\": 44.491\n" +
            "  },\n" +
            " {\n" +
            "  \"REGION_NUMBER\": \"16\",\n" +
            "  \"REGION_NAME\": \"Республика Татарстан\",\n" +
            "  \"REGION_LAT\": 55.712,\n" +
            "  \"REGION_LON\": 50.708\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"116\",\n" +
            "  \"REGION_NAME\": \"Республика Татарстан\",\n" +
            "  \"REGION_LAT\": 55.712,\n" +
            "  \"REGION_LON\": 50.708\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"716\",\n" +
            "  \"REGION_NAME\": \"Республика Татарстан\",\n" +
            "  \"REGION_LAT\": 55.712,\n" +
            "  \"REGION_LON\": 50.708\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"17\",\n" +
            "  \"REGION_NAME\": \"Республика Тыва\",\n" +
            "  \"REGION_LAT\": 55.712,\n" +
            "  \"REGION_LON\": 50.708\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"18\",\n" +
            "  \"REGION_NAME\": \"Удмуртская Республика\",\n" +
            "  \"REGION_LAT\": 56.864,\n" +
            "  \"REGION_LON\": 52.94\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"19\",\n" +
            "  \"REGION_NAME\": \"Республика Хакасия\",\n" +
            "  \"REGION_LAT\": 53.62,\n" +
            "  \"REGION_LON\": 91.204\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"21\",\n" +
            "  \"REGION_NAME\": \"Чувашская Республика\",\n" +
            "  \"REGION_LAT\": 56.06,\n" +
            "  \"REGION_LON\": 47.16\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"22\",\n" +
            "  \"REGION_NAME\": \"Алтайский Край\",\n" +
            "  \"REGION_LAT\": 53.205,\n" +
            "  \"REGION_LON\": 83.544\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"93\",\n" +
            "  \"REGION_NAME\": \"Краснодарский Край\",\n" +
            "  \"REGION_LAT\": 45.411,\n" +
            "  \"REGION_LON\": 38.957\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"123\",\n" +
            "  \"REGION_NAME\": \"Краснодарский Край\",\n" +
            "  \"REGION_LAT\": 45.411,\n" +
            "  \"REGION_LON\": 38.957\n" +
            "}," +
            "{\n" +
            "    \"REGION_NUMBER\": \"24\",\n" +
            "    \"REGION_NAME\": \"Красноярский Край\",\n" +
            "    \"REGION_LAT\": 56.541,\n" +
            "    \"REGION_LON\": 92.77\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"84\",\n" +
            "    \"REGION_NAME\": \"Красноярский Край\",\n" +
            "    \"REGION_LAT\": 56.541,\n" +
            "    \"REGION_LON\": 92.77\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"88\",\n" +
            "    \"REGION_NAME\": \"Красноярский Край\",\n" +
            "    \"REGION_LAT\": 56.541,\n" +
            "    \"REGION_LON\": 92.77\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"124\",\n" +
            "    \"REGION_NAME\": \"Красноярский Край\",\n" +
            "    \"REGION_LAT\": 56.541,\n" +
            "    \"REGION_LON\": 92.77\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"25\",\n" +
            "    \"REGION_NAME\": \"Приморский Край\",\n" +
            "    \"REGION_LAT\": 43.794,\n" +
            "    \"REGION_LON\": 132.928\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"125\",\n" +
            "    \"REGION_NAME\": \"Приморский Край\",\n" +
            "    \"REGION_LAT\": 43.794,\n" +
            "    \"REGION_LON\": 132.928\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"27\",\n" +
            "    \"REGION_NAME\": \"Хабаровский Край\",\n" +
            "    \"REGION_LAT\": 49.02,\n" +
            "    \"REGION_LON\": 134.625\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"127\",\n" +
            "    \"REGION_NAME\": \"Хабаровский Край\",\n" +
            "    \"REGION_LAT\": 49.02,\n" +
            "    \"REGION_LON\": 134.625\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"28\",\n" +
            "    \"REGION_NAME\": \"Амурская Область\",\n" +
            "    \"REGION_LAT\": 50.568,\n" +
            "    \"REGION_LON\": 127.494\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"29\",\n" +
            "    \"REGION_NAME\": \"Архангельская Область\",\n" +
            "    \"REGION_LAT\": 64.763,\n" +
            "    \"REGION_LON\": 41.122\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"30\",\n" +
            "    \"REGION_NAME\": \"Астраханская Область\",\n" +
            "    \"REGION_LAT\": 46.326,\n" +
            "    \"REGION_LON\": 48.139\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"31\",\n" +
            "    \"REGION_NAME\": \"Белгородская Область\",\n" +
            "    \"REGION_LAT\": 50.556,\n" +
            "    \"REGION_LON\": 36.488\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"32\",\n" +
            "    \"REGION_NAME\": \"Брянская Область\",\n" +
            "    \"REGION_LAT\": 53.227,\n" +
            "    \"REGION_LON\": 34.39\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"33\",\n" +
            "    \"REGION_NAME\": \"Владимирская Область\",\n" +
            "    \"REGION_LAT\": 56.117,\n" +
            "    \"REGION_LON\": 40.526\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"34\",\n" +
            "    \"REGION_NAME\": \"Волгоградская Область\",\n" +
            "    \"REGION_LAT\": 48.609,\n" +
            "    \"REGION_LON\": 44.358\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"134\",\n" +
            "    \"REGION_NAME\": \"Волгоградская Область\",\n" +
            "    \"REGION_LAT\": 48.609,\n" +
            "    \"REGION_LON\": 44.358\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"35\",\n" +
            "    \"REGION_NAME\": \"Вологодская Область\",\n" +
            "    \"REGION_LAT\": 59.1,\n" +
            "    \"REGION_LON\": 39.8\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"36\",\n" +
            "    \"REGION_NAME\": \"Воронежская Область\",\n" +
            "    \"REGION_LAT\": 51.628,\n" +
            "    \"REGION_LON\": 39.473\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"136\",\n" +
            "    \"REGION_NAME\": \"Воронежская Область\",\n" +
            "    \"REGION_LAT\": 51.628,\n" +
            "    \"REGION_LON\": 39.473\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"37\",\n" +
            "    \"REGION_NAME\": \"Ивановская Область\",\n" +
            "    \"REGION_LAT\": 56.952,\n" +
            "    \"REGION_LON\": 40.995\n" +
            "  }," +
            "{\n" +
            "    \"REGION_NUMBER\": \"38\",\n" +
            "    \"REGION_NAME\": \"Иркутская Область\",\n" +
            "    \"REGION_LAT\": 52.51,\n" +
            "    \"REGION_LON\": 104.668\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"85\",\n" +
            "    \"REGION_NAME\": \"Иркутская Область\",\n" +
            "    \"REGION_LAT\": 52.51,\n" +
            "    \"REGION_LON\": 104.668\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"138\",\n" +
            "    \"REGION_NAME\": \"Иркутская Область\",\n" +
            "    \"REGION_LAT\": 52.51,\n" +
            "    \"REGION_LON\": 104.668\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"39\",\n" +
            "    \"REGION_NAME\": \"Калининградская Область\",\n" +
            "    \"REGION_LAT\": 54.664,\n" +
            "    \"REGION_LON\": 20.481\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"91\",\n" +
            "    \"REGION_NAME\": \"Калининградская Область\",\n" +
            "    \"REGION_LAT\": 54.664,\n" +
            "    \"REGION_LON\": 20.481\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"40\",\n" +
            "    \"REGION_NAME\": \"Калужская Область\",\n" +
            "    \"REGION_LAT\": 54.51,\n" +
            "    \"REGION_LON\": 36.314\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"41\",\n" +
            "    \"REGION_NAME\": \"Камчатский Край\",\n" +
            "    \"REGION_LAT\": 53.16,\n" +
            "    \"REGION_LON\": 158.352\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"82\",\n" +
            "    \"REGION_NAME\": \"Республика Крым\",\n" +
            "    \"REGION_LAT\": 45.117,\n" +
            "    \"REGION_LON\": 34.886\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"42\",\n" +
            "    \"REGION_NAME\": \"Кемеровская Область\",\n" +
            "    \"REGION_LAT\": 55.265,\n" +
            "    \"REGION_LON\": 86.265\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"142\",\n" +
            "    \"REGION_NAME\": \"Кемеровская Область\",\n" +
            "    \"REGION_LAT\": 55.265,\n" +
            "    \"REGION_LON\": 86.265\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"43\",\n" +
            "    \"REGION_NAME\": \"Кировская Область\",\n" +
            "    \"REGION_LAT\": 58.488,\n" +
            "    \"REGION_LON\": 49.682\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"45\",\n" +
            "    \"REGION_NAME\": \"Курганская Область\",\n" +
            "    \"REGION_LAT\": 55.393,\n" +
            "    \"REGION_LON\": 65.297\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"46\",\n" +
            "    \"REGION_NAME\": \"Курская Область\",\n" +
            "    \"REGION_LAT\": 51.669,\n" +
            "    \"REGION_LON\": 36.135\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"47\",\n" +
            "    \"REGION_NAME\": \"Ленинградская область\",\n" +
            "    \"REGION_LAT\": 59.75,\n" +
            "    \"REGION_LON\": 31.749\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"147\",\n" +
            "    \"REGION_NAME\": \"Ленинградская область\",\n" +
            "    \"REGION_LAT\": 59.75,\n" +
            "    \"REGION_LON\": 31.749\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"48\",\n" +
            "    \"REGION_NAME\": \"Липецкая область\",\n" +
            "    \"REGION_LAT\": 52.564,\n" +
            "    \"REGION_LON\": 39.593\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"49\",\n" +
            "    \"REGION_NAME\": \"Магаданская область\",\n" +
            "    \"REGION_LAT\": 59.95,\n" +
            "    \"REGION_LON\": 149.522\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"50\",\n" +
            "    \"REGION_NAME\": \"Московская область\",\n" +
            "    \"REGION_LAT\": 55.388,\n" +
            "    \"REGION_LON\": 37.59\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"90\",\n" +
            "    \"REGION_NAME\": \"Московская область\",\n" +
            "    \"REGION_LAT\": 55.388,\n" +
            "    \"REGION_LON\": 37.59\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"150\",\n" +
            "    \"REGION_NAME\": \"Московская область\",\n" +
            "    \"REGION_LAT\": 55.388,\n" +
            "    \"REGION_LON\": 37.59\n" +
            "  },\n" +
            "{\n" +
            "    \"REGION_NUMBER\": \"190\",\n" +
            "    \"REGION_NAME\": \"Московская область\",\n" +
            "    \"REGION_LAT\": 55.388,\n" +
            "    \"REGION_LON\": 37.59\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"750\",\n" +
            "    \"REGION_NAME\": \"Московская область\",\n" +
            "    \"REGION_LAT\": 55.388,\n" +
            "    \"REGION_LON\": 37.59\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"52\",\n" +
            "    \"REGION_NAME\": \"Нижегородская Область\",\n" +
            "    \"REGION_LAT\": 56.208,\n" +
            "    \"REGION_LON\": 43.979\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"152\",\n" +
            "    \"REGION_NAME\": \"Нижегородская Область\",\n" +
            "    \"REGION_LAT\": 56.208,\n" +
            "    \"REGION_LON\": 43.979\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"53\",\n" +
            "    \"REGION_NAME\": \"Новгородская Область\",\n" +
            "    \"REGION_LAT\": 58.479,\n" +
            "    \"REGION_LON\": 31.299\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"54\",\n" +
            "    \"REGION_NAME\": \"Новосибирская Область\",\n" +
            "    \"REGION_LAT\": 55.001,\n" +
            "    \"REGION_LON\": 82.699\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"154\",\n" +
            "    \"REGION_NAME\": \"Новосибирская Область\",\n" +
            "    \"REGION_LAT\": 55.001,\n" +
            "    \"REGION_LON\": 82.699\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"55\",\n" +
            "    \"REGION_NAME\": \"Омская Область\",\n" +
            "    \"REGION_LAT\": 54.934,\n" +
            "    \"REGION_LON\": 73.392\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"56\",\n" +
            "    \"REGION_NAME\": \"Оренбургская Область\",\n" +
            "    \"REGION_LAT\": 51.726,\n" +
            "    \"REGION_LON\": 55.049\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"57\",\n" +
            "    \"REGION_NAME\": \"Орловская Область\",\n" +
            "    \"REGION_LAT\": 52.961,\n" +
            "    \"REGION_LON\": 36.141\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"58\",\n" +
            "    \"REGION_NAME\": \"Пензенская Область\",\n" +
            "    \"REGION_LAT\": 53.187,\n" +
            "    \"REGION_LON\": 44.967\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"59\",\n" +
            "    \"REGION_NAME\": \"Пермский Край\",\n" +
            "    \"REGION_LAT\": 57.941,\n" +
            "    \"REGION_LON\": 56.196\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"81\",\n" +
            "    \"REGION_NAME\": \"Пермский Край\",\n" +
            "    \"REGION_LAT\": 57.941,\n" +
            "    \"REGION_LON\": 56.196\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"159\",\n" +
            "    \"REGION_NAME\": \"Пермский Край\",\n" +
            "    \"REGION_LAT\": 57.941,\n" +
            "    \"REGION_LON\": 56.196\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"60\",\n" +
            "    \"REGION_NAME\": \"Псковская Область\",\n" +
            "    \"REGION_LAT\": 57.772,\n" +
            "    \"REGION_LON\": 28.336\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"60\",\n" +
            "    \"REGION_NAME\": \"Псковская Область\",\n" +
            "    \"REGION_LAT\": 57.772,\n" +
            "    \"REGION_LON\": 28.336\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"61\",\n" +
            "    \"REGION_NAME\": \"Ростовская Область\",\n" +
            "    \"REGION_LAT\": 47.176,\n" +
            "    \"REGION_LON\": 39.58\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"161\",\n" +
            "    \"REGION_NAME\": \"Ростовская Область\",\n" +
            "    \"REGION_LAT\": 47.176,\n" +
            "    \"REGION_LON\": 39.58\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"761\",\n" +
            "    \"REGION_NAME\": \"Ростовская Область\",\n" +
            "    \"REGION_LAT\": 47.176,\n" +
            "    \"REGION_LON\": 39.58\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"62\",\n" +
            "    \"REGION_NAME\": \"Рязанская Область\",\n" +
            "    \"REGION_LAT\": 54.587,\n" +
            "    \"REGION_LON\": 39.702\n" +
            "  },\n" +
            " {\n" +
            "    \"REGION_NUMBER\": \"63\",\n" +
            "    \"REGION_NAME\": \"Самарская Область\",\n" +
            "    \"REGION_LAT\": 53.059,\n" +
            "    \"REGION_LON\": 50.149\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"163\",\n" +
            "    \"REGION_NAME\": \"Самарская Область\",\n" +
            "    \"REGION_LAT\": 53.059,\n" +
            "    \"REGION_LON\": 50.149\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"763\",\n" +
            "    \"REGION_NAME\": \"Самарская Область\",\n" +
            "    \"REGION_LAT\": 53.059,\n" +
            "    \"REGION_LON\": 50.149\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"64\",\n" +
            "    \"REGION_NAME\": \"Саратовская Область\",\n" +
            "    \"REGION_LAT\": 51.562,\n" +
            "    \"REGION_LON\": 45.757\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"164\",\n" +
            "    \"REGION_NAME\": \"Саратовская Область\",\n" +
            "    \"REGION_LAT\": 51.562,\n" +
            "    \"REGION_LON\": 45.757\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"65\",\n" +
            "    \"REGION_NAME\": \"Сахалинская Область\",\n" +
            "    \"REGION_LAT\": 50.675,\n" +
            "    \"REGION_LON\": 142.971\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"66\",\n" +
            "    \"REGION_NAME\": \"Свердловская Область\",\n" +
            "    \"REGION_LAT\": 56.719,\n" +
            "    \"REGION_LON\": 60.299\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"96\",\n" +
            "    \"REGION_NAME\": \"Свердловская Область\",\n" +
            "    \"REGION_LAT\": 56.719,\n" +
            "    \"REGION_LON\": 60.299\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"196\",\n" +
            "    \"REGION_NAME\": \"Свердловская Область\",\n" +
            "    \"REGION_LAT\": 56.719,\n" +
            "    \"REGION_LON\": 60.299\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"67\",\n" +
            "    \"REGION_NAME\": \"Смоленская Область\",\n" +
            "    \"REGION_LAT\": 54.709,\n" +
            "    \"REGION_LON\": 32.047\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"68\",\n" +
            "    \"REGION_NAME\": \"Тамбовская Область\",\n" +
            "    \"REGION_LAT\": 52.708,\n" +
            "    \"REGION_LON\": 41.295\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"69\",\n" +
            "    \"REGION_NAME\": \"Тверская Область\",\n" +
            "    \"REGION_LAT\": 56.818,\n" +
            "    \"REGION_LON\": 35.818\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"169\",\n" +
            "    \"REGION_NAME\": \"Тверская Область\",\n" +
            "    \"REGION_LAT\": 56.818,\n" +
            "    \"REGION_LON\": 35.818\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"70\",\n" +
            "    \"REGION_NAME\": \"Томская Область\",\n" +
            "    \"REGION_LAT\": 56.462,\n" +
            "    \"REGION_LON\": 84.684\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"71\",\n" +
            "    \"REGION_NAME\": \"Тульская Область\",\n" +
            "    \"REGION_LAT\": 54.188,\n" +
            "    \"REGION_LON\": 37.717\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"72\",\n" +
            "    \"REGION_NAME\": \"Тюменская Область\",\n" +
            "    \"REGION_LAT\": 57.132,\n" +
            "    \"REGION_LON\": 65.941\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"73\",\n" +
            "    \"REGION_NAME\": \"Ульяновская Область\",\n" +
            "    \"REGION_LAT\": 54.267,\n" +
            "    \"REGION_LON\": 48.332\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"173\",\n" +
            "    \"REGION_NAME\": \"Ульяновская Область\",\n" +
            "    \"REGION_LAT\": 54.267,\n" +
            "    \"REGION_LON\": 48.332\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"74\",\n" +
            "    \"REGION_NAME\": \"Челябинская Область\",\n" +
            "    \"REGION_LAT\": 55.17,\n" +
            "    \"REGION_LON\": 61.119\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"174\",\n" +
            "    \"REGION_NAME\": \"Челябинская Область\",\n" +
            "    \"REGION_LAT\": 55.17,\n" +
            "    \"REGION_LON\": 61.119\n" +
            "  },\n" +
            "{\n" +
            "    \"REGION_NUMBER\": \"75\",\n" +
            "    \"REGION_NAME\": \"Забайкальский Край\",\n" +
            "    \"REGION_LAT\": 51.905,\n" +
            "    \"REGION_LON\": 115.433\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"80\",\n" +
            "    \"REGION_NAME\": \"Забайкальский Край\",\n" +
            "    \"REGION_LAT\": 51.905,\n" +
            "    \"REGION_LON\": 115.433\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"76\",\n" +
            "    \"REGION_NAME\": \"Ярославская Область\",\n" +
            "    \"REGION_LAT\": 57.557,\n" +
            "    \"REGION_LON\": 39.881\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"77\",\n" +
            "    \"REGION_NAME\": \"Москва\",\n" +
            "    \"REGION_LAT\": 55.7,\n" +
            "    \"REGION_LON\": 37.63\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"97\",\n" +
            "    \"REGION_NAME\": \"Москва\",\n" +
            "    \"REGION_LAT\": 55.7,\n" +
            "    \"REGION_LON\": 37.63\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"99\",\n" +
            "    \"REGION_NAME\": \"Москва\",\n" +
            "    \"REGION_LAT\": 55.7,\n" +
            "    \"REGION_LON\": 37.63\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"177\",\n" +
            "    \"REGION_NAME\": \"Москва\",\n" +
            "    \"REGION_LAT\": 55.7,\n" +
            "    \"REGION_LON\": 37.63\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"199\",\n" +
            "    \"REGION_NAME\": \"Москва\",\n" +
            "    \"REGION_LAT\": 55.7,\n" +
            "    \"REGION_LON\": 37.63\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"197\",\n" +
            "    \"REGION_NAME\": \"Москва\",\n" +
            "    \"REGION_LAT\": 55.7,\n" +
            "    \"REGION_LON\": 37.63\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"777\",\n" +
            "    \"REGION_NAME\": \"Москва\",\n" +
            "    \"REGION_LAT\": 55.7,\n" +
            "    \"REGION_LON\": 37.63\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"799\",\n" +
            "    \"REGION_NAME\": \"Москва\",\n" +
            "    \"REGION_LAT\": 55.7,\n" +
            "    \"REGION_LON\": 37.63\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"78\",\n" +
            "    \"REGION_NAME\": \"Санкт-Петербург\",\n" +
            "    \"REGION_LAT\": 59.899,\n" +
            "    \"REGION_LON\": 30.32\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"98\",\n" +
            "    \"REGION_NAME\": \"Санкт-Петербург\",\n" +
            "    \"REGION_LAT\": 59.899,\n" +
            "    \"REGION_LON\": 30.32\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"178\",\n" +
            "    \"REGION_NAME\": \"Санкт-Петербург\",\n" +
            "    \"REGION_LAT\": 59.899,\n" +
            "    \"REGION_LON\": 30.32\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"198\",\n" +
            "    \"REGION_NAME\": \"Санкт-Петербург\",\n" +
            "    \"REGION_LAT\": 59.899,\n" +
            "    \"REGION_LON\": 30.32\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"79\",\n" +
            "    \"REGION_NAME\": \"Еврейская Автономия\",\n" +
            "    \"REGION_LAT\": 48.735,\n" +
            "    \"REGION_LON\": 132.919\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"83\",\n" +
            "    \"REGION_NAME\": \"Ненецкий Автономный Округ \",\n" +
            "    \"REGION_LAT\": 67.944,\n" +
            "    \"REGION_LON\": 52.432\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"86\",\n" +
            "    \"REGION_NAME\": \"Автономный Округ Югра\",\n" +
            "    \"REGION_LAT\": 60.958,\n" +
            "    \"REGION_LON\": 69.082\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"87\",\n" +
            "    \"REGION_NAME\": \"Чукотский Автономный Округ\",\n" +
            "    \"REGION_LAT\": 66.604,\n" +
            "    \"REGION_LON\": 171.64\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"89\",\n" +
            "    \"REGION_NAME\": \"Ямало-Ненецкий Автономный Округ\",\n" +
            "    \"REGION_LAT\": 65.908,\n" +
            "    \"REGION_LON\": 76.896\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"92\",\n" +
            "    \"REGION_NAME\": \"Севастополь\",\n" +
            "    \"REGION_LAT\": 44.588,\n" +
            "    \"REGION_LON\": 33.545\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"94\",\n" +
            "    \"REGION_NAME\": \"Байконур\",\n" +
            "    \"REGION_LAT\": 45.61,\n" +
            "    \"REGION_LON\": 63.313\n" +
            "  },\n" +
            "  {\n" +
            "    \"REGION_NUMBER\": \"95\",\n" +
            "    \"REGION_NAME\": \"Чеченская Республика\",\n" +
            "    \"REGION_LAT\": 43.291,\n" +
            "    \"REGION_LON\": 45.761\n" +
            "  }," +
            " {\n" +
            "    \"REGION_NUMBER\": \"26\",\n" +
            "    \"REGION_NAME\": \"Cтавропольский Край\",\n" +
            "    \"REGION_LAT\": 45.021,\n" +
            "    \"REGION_LON\": 42.005\n" +
            "  }," +
            " {\n" +
            "    \"REGION_NUMBER\": \"126\",\n" +
            "    \"REGION_NAME\": \"Cтавропольский Край\",\n" +
            "    \"REGION_LAT\": 45.021,\n" +
            "    \"REGION_LON\": 42.005\n" +
            "  }" +
            "]";

    public static ArrayList<RegionObject> getArrayOfData(){
        JSONArray arrayOfRegions;
        ArrayList<RegionObject> arrayList = new ArrayList<>();
        String jsonString = JsonData;
        try{

            if(jsonString != "") {
                arrayOfRegions = new JSONArray(jsonString);
                for (int i = 0; i < arrayOfRegions.length(); i++) {
                    JSONObject obj = arrayOfRegions.getJSONObject(i);
                    String regNum = obj.getString(REGION_NUMBER);
                    String regName = obj.getString(REGION_NAME);
                    double regLat = obj.getDouble(REGION_LAT);
                    double regLon = obj.getDouble(REGION_LON);
                    arrayList.add(new RegionObject(regNum, regName, regLat, regLon));
                }
            }else{
                arrayOfRegions = new JSONArray();
            }
        }catch (JSONException exc){
            exc.printStackTrace();
        }
        return arrayList;
    }


}
