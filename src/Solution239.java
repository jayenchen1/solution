import java.util.ArrayDeque;

public class Solution239 {
    public static void main(String[] args) {
        int[] ints = new SolutionIn239().maxSlidingWindow(new int[]{-1202,7068,-2705,3159,-398,786,5303,-9662,-109,-5256,4650,8345,2669,1465,-3552,5347,181,4830,-1018,-8237,-4305,4968,-1000,6762,-6620,-3714,6598,5681,4205,-4229,3879,-7038,-843,-9542,-8565,7175,-9772,-6923,-7681,46,-465,7551,-4129,7320,3035,9862,4845,-2688,3629,39,-3393,-1293,-3529,4773,-1466,-5074,2726,-8191,3948,3314,9705,3260,-1051,-3748,-2317,-5500,-2683,3465,3661,282,811,9982,-719,-5266,8031,6367,-5476,8762,-8380,-4587,7319,-8213,5100,5772,1470,7568,-4502,5221,9943,7754,-5680,-1315,516,-4648,-5349,-7531,-6459,-1804,9236,-1488,8296,216,6042,3655,9727,-7421,-9044,1754,-5846,3562,-8774,-2010,6587,707,-4524,-6424,-9977,4543,4414,-5942,-7926,7307,7430,4989,-836,-7486,-1114,2855,-1585,-4529,6097,-5446,-8334,4760,3856,5163,-3403,-4660,8997,5641,9133,-1149,8819,4569,8693,8762,-3662,-8779,-7500,-3206,6455,2988,-1719,3222,5285,-5353,2218,9778,2819,5020,-633,7670,1266,6912,-2276,-6220,-2925,-9810,1467,9826,-8802,9568,-3481,-6534,837,5802,1070,-857,2531,-3954,-754,-7219,7482,9506,8888,9469,-1574,9277,4272,-5004,1097,-9125,4043,341,-9764,-2048,7073,9455,2895,4680,2370,-9070,-5341,-3791,-9345,-9618,-1303,-6281,-9278,8299,1348,-3324,-6287,8402,675,-4075,-3545,7569,-7513,-4064,4181,4928,-4359,644,-4737,-562,9484,-4236,4165,-7783,8386,-1507,-5665,-2356,-9711,7275,6168,-7117,-8124,-4373,538,8262,-2917,-3079,-5556,-7162,-9130,8760,-2914,6156,-886,-5288,-2986,870,-4815,2489,-6597,-864,-7425,-7773,-1538,2205,3488,8768,-7616,6045,-5551,-4589,-4626,724,-4207,4682,1240,-3727,-7406,8433,-8006,-8774,3143,-8432,1955,-1840,3123,5899,6753,-9310,7266,-2150,-4088,3142,6370,-6001,-4766,-8007,4907,4385,9601,-3925,5503,394,7309,4318,-1713,-8997,-2839,1848,-787,-2743,-754,3443,8643,35,-3224,-5472,435,3916,-7864,-7392,-8496,3766,-3135,3300,-1613,-4373,-4375,-2045,763,8438,6930,-4186,-422,5766,-8255,-2209,-7796,-7047,8268,779,134,-7893,2870,-1691,-9568,-6078,-6125,4140,-757,-6069,-6905,1387,1007,9815,6128,5344,-1897,-1513,8967,145,-8649,-4234,7846,-1068,-4221,8569,3670,399,7222,3494,-4985,-484,7702,7159,-2844,6639,9702,-3468,-4091,5692,9112,7096,-6568,-9162,-2402,-8473,8428,5392,1244,-994,681,-3633,-2748,5203,2522,1290,-5566,8015,1593,-7248,-173,3344,7511,-604,4612,-9024,-1178,6610,7438,5786,7186,9147,-3525,3620,-2263,-2181,-5966,3410,5850,2103,-7645,2149,-4330,2668,4596,-1189,2359,1587,-9086,-4473,9186,270,-7960,4856,4617,4374,51,7643,7946,2473,3813,-1783,6502,3871,-1440,1434,1650,1000,3266,-5874,-9296,-3093,4346,-6076,3663,959,5623,-8362,-9988,-6956,3257,-9702,-4119,8860,2932,-1053,-1354,1898,4736,4221,-8782,-1138,8141,2975,-8230,-4870,-1510,5618,-6556,-3505,-1477,9571,9814,-8088,7839,8371,-9265,9392,8364,-1385,-3676,-667,7562,2564,724,-5516,-9959,-8102,-1970,-3000,2295,9405,5965,-3218,6010,1067,2734,5528,-366,7328,4594,7320,-7491,6585,8741,1166,-8139,-6656,5510,8384,-2466,-9656,3767,2437,8638,2524,-8214,-1695,-5516,-9900,-9355,9930,2875,-9856,-5042,-4444,3574,5524,2583,1107,-2801,6824,-6156,5083,663,2178,-4962,-1961,5487,1199,2539,-9760,-2367,-5553,9240,-1283,9836,-3026,-1409,-3270,-2944,-3356,8075,968,7327,-7608,-9929,3026,-8432,-8542,-7514,9644,-7411,5508,7608,-212,-1221,-9371,7944,-8788,-190,3278,7534,6508,5151,-2233,-5612,8522,5307,9136,4573,1468,1264,-5834,7043,1953,-5452,-6489,-4653,-5646,1787,-7525,-4227,-1763,7378,-6274,-1,9236,-9607,7803,4881,-7236,-4863,2634,-6935,-5012,-7445,2037,9333,-4374,6435,-2627,7397,-7166,9533,7799,-9842,388,-5030,31,-4047,-8042,626,2911,-7579,1945,853,-9632,-8468,-343,-957,8046,-5467,-6910,-9133,587,4738,2502,5115,-151,7323,-664,3205,8770,9584,-1615,5427,5714,7368,-2855,624,3432,-9769,-8064,-649,2346,398,9787,5232,-658,-2183,7548,-3126,5613,-6398,-3013,-1063,5968,-8088,2376,2275,7770}, 456);
        for (int i : ints) {
            System.out.print(i+" ");
        }
    }
}
class SolutionIn239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
        int[] res=new int[nums.length-k+1];
        int j=0;
        for(int i=0;i<nums.length;i++){

            // if(i>=2){
            while(!dq.isEmpty()&&nums[i]>=dq.getLast()){
                dq.removeLast();
            }
            dq.addFirst(nums[i]);
            if(i>=k-1){
                res[j++]=dq.getLast();
                if(dq.size()==k){
                    dq.removeLast();
                    while(!dq.isEmpty()&&dq.getFirst()>dq.getLast()){
                        dq.removeLast();
                    }
                }

            }
            // }else{
            //     dq.addFirst(nums[i]);
            // }
        }
        return res;
    }
}