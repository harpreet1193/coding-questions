package com.example.codingquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {

    public static void main (String []args){
        int []arr = new int[]{9489,8245,6980,7076,1396,8163,2524,6553,2644,2690,5714,471,360,4953,5789,2197,9790,9883,6448,1809,8883,8285,8747,2204,1957,4775,1588,1362,8930,3273,1822,4855,1388,5653,2323,4205,1387,9578,7299,2195,4799,1553,457,1271,7489,3280,86,4315,7861,4491,8221,6405,2207,6923,6746,6305,7278,8695,7440,386,1705,7758,7053,8021,2277,2471,4524,9814,9808,8128,359,2828,6173,8130,3014,2655,9356,2118,8360,9466,8981,7713,1885,8811,7857,3210,9119,776,3862,6572,2731,107,1805,5414,2063,3406,2225,2864,4817,5090,6070,9097,9609,4761,8883,7339,3196,1892,3933,1328,7047,7814,9426,1438,3540,9607,4111,5661,7756,9220,9918,746,5641,6964,1248,452,4870,4566,9123,6147,7046,8166,2656,6120,9502,4030,531,4064,496,137,7976,3330,2437,9891,1487,2888,8054,5116,3387,4250,6486,6923,8044,1813,5168,7519,4663,2971,9912,7585,5023,1284,5825,5573,9523,7747,1643,1423,6404,3683,2966,8547,7536,8096,679,9733,6592,658,182,8830,6026,1875,5442,5648,9316,3714,8145,449,8758,3888,3080,1523,4394,5352,1668,4500,6291,9276,6674,5089,1671,1642,3185,7941,6379,3469,674,9295,8682,9984,5721,9138,7360,4605,4099,4103,5481,3492,7795,285,6833,2327,827,2256,4232,7538,7891,3334,4996,6984,6441,790,1923,6152,2198,3028,9403,3326,1945,567,6576,118,9538,3420,1538,4524,9837,867,5919,9439,5864,7575,284,1892,307,3852,684,7926,5555,8416,9690,331,5539,947,8297,65,5257,5715,7494,7287,0,6384,246,9977,2822,3039,2417,4052,7060,9338,123,8631,5477,8916,2315,7514,9125,3211,3882,9240,5448,838,2137,3032,5973,253,5407,1162,4589,9207,3038,6636,8427,1518,6081,9548,857,3760,2164,5448,2780,6895,8336,1777,286,3400,530,8478,710,7777,2934,541,4598,5930,7061,7396,9313,3718,344,4438,2087,5780,5800,5313,3070,3413,6052,1460,830,7874,1374,2861,873,4454,6083,2048,9734,3526,2676,9316,7273,5570,8181,8472,6176,5379,658,355,5612,4132,1641,3753,3610,2765,4056,6169,1181,6026,3172,9939,1242,8234,4195,2263,1040,1875,5910,6761,626,643,2087,3232,2306,4642,3611,6813,5691,6739,2435,57,6171,9929,6613,6296,6859,9254,7970,3369,8877,2239,8964,8303,2977,7643,1334,4746,4548,1994,192,1022,341,1330,8157,3398,2293,1205,7483,5345,5163,2751,8430,2266,7649,5435,6897,53,7214,196,8106,2629,1809,5865,3705,9243,8455,7322,3597,2298,4809,1455,8563,4485,4469,888,171,425,2550,959,409,791,9939,2522,7749,8265,2738,6796,6832,9638,4439,7691,5364,1249,3325,1276,2198,5404,8799,5322,9530,2474,3667,5574,4531,5345,2435,600,630,9470,6874,9780,8809,3299,7144,9112,5086,1628,1234,4882,5574,3231,8169,1310,6052,2465,4773,6268,559,7349,8141,9552,3730,6367,8998,7299,5780,7447,5798,5751,6512,8105,2131,5032,2304,9593,9469,6030,1019,2964,8613,3055,168,578,7097,1153,6493,3112,4365,5261,7593,874,6887,3327,1018,8173,4374,8442,3643,7466,2640,937,990,9358,9495,2592,946,9902,1544,8368,7473,5176,1360,7193,5993,8597,4234,874,7365,2907,4409,8436,6359,3599,4815,5660,3972,3591,8152,6639,6396,3310,3814,6257,9428,4448,5081,1662,978,5077,7050,5681,1780,459,741,5299,3710,1547,3857,6138,5806,4334,8990,3091,205,6313,9497,3131,4581,9827,158,7543,4297,2599,3403,3507,7590,5285,8173,9079,3140,7618,2074,6678,7784,7808,8746,9232,9802,1513,2082,8472,7133,7797,7310,4591,4528,2651,8203,3663,7361,8883,2270,8964,3049,8714,6436,420,4135,431,9799,5872,3149,7354,3786,5650,5553,2156,6114,630,9153,1826,9809,1829,6215,3731,8303,2109,2052,8121,4295,7548,6715,3404,5771,6603,9933,8809,1893,1384,2749,3410,3356,4251,2016,7376,8063,5306,6243,8723,8881,3528,6760,5130,1185,6440,6686,1741,1972,2319,4779,4759,2401,5655,4697,4050,5305,5504,1083,7515,4594,8914,2891,836,2878,4973,2065,6520,556,4049,4753,5225,8907,2937,3106,869,3622,3490,6055,2231,9985,8714,2172,3242,6319,9476,1246,7528,9485,1080,7782,9889,6158,662,9364,5703,6195,4315,4805,214,5879,604,8353,1185,3732,2831,7859,6471,8614,2490,2422,1413,2186,6979,1400,5221,9459,5654,7661,756,3753,581,243,5473,9309,4473,9694,3217,4654,471,3423,9759,3889,4846,4981,5104,4065,8317,64,4309,579,3250,5198,4219,1540,2588,7605,6764,609,6002,7836,7432,9779,4012,9606,9022,8549,8975,5595,9891,563,5927,1732,1734,321,8684,4819,6842,7077,871,1933,594,6514,6766,6501,4236,7570,2331,1511,1076,8590,2811,6493,1689,5213,8322,9985,3964,2408,4923,8736,3428,3910,1949,5031,8543,5577,4218,1405,7987,6259,3169,3725,867};
        int n = arr.length;
        System.out.println(leaders(arr, n));
    }

    public static ArrayList<Integer> leaders(int []arr, int n) {

        int leaderNow = Integer.MIN_VALUE;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=n-1; i>=0;i--){
            if (leaderNow <= arr[i]){
                res.add(arr[i]);
                leaderNow = arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    }
}
