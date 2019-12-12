package com.mygdx.game.screen;

public class SongData
{
    static float slotLength = 200.0f;
    static int accuracy = 0;
    static int score = 0;

    static float[] timeStamps = {
            // INTRO (LEFT - RIGHT - LEFT - RIGHT)
            2.154f,
            4.324f,
            6.387f,
            8.512f,
            9.585f,
            10.643f,
            11.717f,
            12.783f,
            13.841f,
            14.907f,

            // MIDDLE - DOUBLE_TAPPER A
            17.096f,
            17.583f,
            17.583f,

            18.112f,
            18.611f,
            18.611f,

            19.170f,
            19.669f,
            19.669f,

            20.228f,
            20.742f,
            20.742f,

            // MIDDLE - DOUBLE_TAPPER B
            21.287f,
            21.816f,
            21.816f,

            22.345f,
            22.859f,
            22.859f,

            23.388f,
            23.947f,
            23.947f,

            24.461f,
            25.051f,
            25.051f,

            // MIDDLE - DOUBLE_TAPPER C
            25.520f,
            26.049f,
            26.049f,

            26.563f,
            27.017f,
            27.017f,

            27.651f,
            28.165f,
            28.165f,

            28.695f,
            29.239f,
            29.239f,

            // MIDDLE - DOUBLE_TAPPER C
            29.768f,
            30.297f,
            30.297f,

            30.841f,
            31.340f,
            31.340f,

            31.900f,
            32.414f,
            32.414f,

            32.958f,
            33.502f,
            33.502f,

            // ONE - TWO - DOUBLE A
            34.009f,
            34.273f,
            34.539f,
            34.539f,

            35.078f,
            35.337f,
            35.605f,
            35.605f,

            36.133f,
            36.403f,
            36.671f,
            36.671f,

            37.195f,
            37.463f,
            37.728f,
            37.728f,

            // ONE - TWO - DOUBLE B
            38.261f,
            38.533f,
            38.788f,
            38.788f,

            39.315f,
            39.599f,
            39.852f,
            39.852f,

            40.385f,
            40.653f,
            40.906f,
            40.906f,

            41.432f,
            41.711f,
            41.972f,
            41.972f,
            42.250f,
            42.250f,

            // ONE - TWO - DOUBLE C
            42.518f,
            42.773f,
            43.042f,
            43.042f,

            43.569f,
            43.835f,
            44.102f,
            44.102f,

            44.631f,
            44.898f,
            45.164f,
            45.164f,

            45.699f,
            45.960f,
            46.224f,
            46.224f,
            46.491f,
            46.491f,

            // ONE - TWO - DOUBLE D
            46.757f,
            47.037f,
            47.300f,
            47.300f,
            47.570f,
            47.570f,

            47.828f,
            48.087f,
            48.345f,
            48.345f,
            48.613f,

            48.881f,
            49.134f,
            49.134f,
            49.399f,
            49.399f,
            49.679f,
            49.679f,

            // SOLO A
            51.011f,

            53.936f,
            54.059f,
            54.059f,
            54.460f,
            54.721f,
            55.015f,
            55.276f,

            57.380f,
            57.380f,
            57.380f,
            57.380f,

            59.246f,
            59.514f,
            59.763f,
            60.046f,
            60.220f,
            60.560f,
            60.560f,

            61.626f,
            62.688f,
            63.497f,
            63.765f,
            63.765f,

            // SOLO B
            68.006f,

            70.113f,
            70.387f,
            70.880f,
            71.053f,
            71.053f,
            71.427f,
            71.715f,
            71.983f,
            72.247f,

            73.586f,
            74.361f,
            74.641f,
            74.898f,
            75.036f,
            75.161f,
            75.290f,

            75.979f,
            76.102f,
            76.234f,
            76.361f,
            76.485f,

            78.624f,
            80.255f,
            80.756f,
            80.756f,

            // TRIPLES A
            85.024f,
            85.142f,
            85.265f,
            85.390f,
            85.515f,
            85.641f,

            85.783f,
            85.923f,
            86.048f,
            86.173f,
            86.309f,
            86.451f,

            86.585f,
            86.718f,
            86.848f,
            86.976f,

            87.112f,
            87.248f,
            87.376f,
            87.510f,
            87.644f,
            87.781f,

            87.913f,
            88.041f,
            88.164f,
            88.300f,
            88.438f,
            88.572f,

            88.710f,
            88.841f,
            88.975f,
            89.109f,

            // TRIPLES B
            89.228f,
            89.353f,
            89.483f,
            89.619f,
            89.758f,
            89.902f,

            90.030f,
            90.163f,
            90.294f,
            90.421f,
            90.549f,
            90.675f,

            90.815f,
            90.947f,
            91.085f,
            91.211f,

            91.354f,
            91.490f,
            91.619f,
            91.749f,
            91.885f,
            92.019f,

            92.159f,
            92.288f,
            92.424f,
            92.558f,
            92.685f,
            92.823f,

            92.949f,
            93.076f,
            93.212f,
            93.340f,

            // TRIPLES C
            93.476f,
            93.614f,
            93.745f,
            93.887f,
            94.017f,
            94.145f,

            94.280f,
            94.412f,
            94.542f,
            94.671f,
            94.805f,
            94.935f,

            95.060f,
            95.190f,
            95.336f,
            95.474f,

            95.602f,
            95.737f,
            95.869f,
            95.994f,
            96.133f,
            96.269f,

            96.404f,
            96.543f,
            96.672f,
            96.799f,
            96.927f,
            97.063f,

            97.201f,
            97.335f,
            97.468f,
            97.602f,

            // TRIPLES D
            97.728f,
            97.866f,
            97.995f,
            98.123f,
            98.254f,
            98.386f,

            98.524f,
            98.662f,
            98.790f,
            98.923f,
            99.053f,
            99.189f,

            99.318f,
            99.452f,
            99.584f,
            99.711f,

            99.851f,
            99.989f,
            100.115f,
            100.247f,
            100.384f,
            100.512f,

            100.648f,
            100.780f,
            100.911f,
            101.043f,
            101.183f,
            101.311f,

            101.444f,
            101.576f,
            101.710f,
            101.852f,

            // DOUBLES
            101.986f,
            101.986f,
            102.770f,
            102.770f,
            103.579f,
            103.579f,

            105.686f,
            105.686f,
            106.215f,
            106.215f,
            107.037f,
            107.037f,
            107.826f,
            107.826f,

            110.464f,
            110.464f,
            111.265f,
            111.265f,
            112.072f,
            112.072f,
            112.866f,
            112.866f,
            113.648f,
            113.648f,
            114.185f,
            114.185f,
            114.712f,
            114.712f,
            115.511f,
            115.511f,
            116.311f,
            116.311f,
            116.842f,
            116.842f,
            117.639f,
            117.639f,
            118.437f,
            118.437f,

            // QUADRUPLES
            118.970f,

            119.117f,
            119.245f,
            119.372f,
            119.504f,

            119.637f,
            119.763f,
            119.901f,
            120.024f,

            120.158f,
            120.292f,
            120.427f,
            120.553f,

            120.682f,
            120.820f,
            120.958f,
            121.097f,

            121.230f,
            121.362f,
            121.494f,
            121.619f,

            121.742f,
            121.887f,
            122.025f,
            122.165f,

            122.297f,
            122.424f,
            122.556f,
            122.687f,

            122.812f,
            122.951f,
            123.089f,
            123.222f,

            123.352f,
            123.488f,
            123.613f,
            123.741f,

            123.883f,
            124.030f,
            124.163f,
            124.284f,

            124.406f,
            124.537f,
            124.673f,
            124.800f,

            124.932f,
            125.079f,
            125.206f,
            125.329f,

            125.467f,
            125.608f,
            125.741f,
            125.877f,

            126.007f,
            126.145f,
            126.287f,
            126.410f,

            126.542f,
            126.678f,
            126.812f,
            126.939f,

            127.067f,
            127.203f,
            127.332f,
            127.458f,

            127.606f,
            127.748f,
            127.884f,
            128.008f,

            128.139f,
            128.277f,
            128.409f,
            128.538f,

            128.672f,
            128.808f,
            128.934f,
            129.059f,

            129.182f,
            129.329f,
            129.462f,
            129.590f,

            129.734f,
            129.866f,
            129.991f,
            130.121f,

            130.259f,
            130.397f,
            130.522f,
            130.652f,

            130.796f,
            130.936f,
            131.070f,
            131.196f,

            131.325f,
            131.457f,
            131.580f,
            131.712f,

            131.852f,
            131.992f,
            132.117f,
            132.253f,

            132.395f,
            132.523f,
            132.650f,
            132.776f,

            132.911f,
            133.048f,
            133.177f,
            133.309f,

            133.445f,
            133.580f,
            133.712f,
            133.840f,

            133.974f,
            134.116f,
            134.241f,
            134.369f,

            134.502f,
            134.642f,
            134.783f,
            134.912f,

            135.037f,
            135.167f,
            135.301f,
            135.426f,

            135.560f,
            135.702f,
            135.832f,
            135.966f,

            136.104f,
            136.240f,
            136.367f,
            136.495f,

            136.632f,
            136.766f,
            136.900f,
            137.028f,

            137.161f,
            137.293f,
            137.420f,
            137.554f,

            137.694f,
            137.822f,
            137.952f,
            138.087f,

            138.255f,
            138.361f,
            138.491f,
            138.620f,

            138.754f,
            138.892f,
            139.033f,
            139.156f,

            139.289f,
            139.419f,
            139.549f,
            139.680f,

            139.812f,
            139.946f,
            140.071f,
            140.199f,

            140.349f,
            140.489f,
            140.615f,
            140.742f,

            140.876f,
            141.006f,
            141.139f,
            141.261f,

            141.407f,
            141.543f,
            141.681f,
            141.806f,

            141.934f,
            142.068f,
            142.199f,
            142.333f,

            142.463f,
            142.601f,
            142.737f,
            142.864f,

            142.996f,
            143.132f,
            143.263f,
            143.393f,

            143.529f,
            143.671f,
            143.807f,
            143.928f,

            144.058f,
            144.191f,
            144.317f,
            144.450f,

            144.599f,
            144.733f,
            144.865f,
            144.988f,

            145.128f,
            145.255f,
            145.385f,
            145.523f,

            145.659f,
            145.789f,
            145.927f,
            146.056f,

            146.181f,
            146.320f,
            146.443f,
            146.577f,

            146.721f,
            146.861f,
            146.991f,
            147.120f,

            147.245f,
            147.377f,
            147.513f,
            147.649f,

            147.777f,
            147.915f,
            148.050f,
            148.182f,

            148.309f,
            148.443f,
            148.571f,
            148.703f,

            148.843f,
            148.976f,
            149.108f,
            149.234f,

            149.365f,
            149.497f,
            149.637f,
            149.766f,

            149.900f,
            150.034f,
            150.168f,
            150.297f,

            150.429f,
            150.569f,
            150.699f,
            150.818f,

            150.952f,
            151.098f,
            151.243f,
            151.374f,

            151.504f,
            151.627f,
            151.763f,
            151.895f,

            // DRUMS
            153.999f,

            154.279f,
            154.411f,
            154.544f,
            154.544f,

            154.792f,
            154.937f,
            155.079f,

            155.399f,
            155.380f,
            155.613f,
            155.613f,

            155.870f,
            156.008f,
            156.137f,

            156.402f,
            156.539f,
            156.667f,
            156.667f,

            156.932f,
            157.071f,
            157.203f,

            157.463f,
            157.602f,
            157.729f,
            157.729f,

            157.995f,
            158.132f,
            158.261f,

            158.520f,
            158.651f,
            158.787f,
            158.787f,

            159.049f,
            159.182f,
            159.316f,

            159.581f,
            159.712f,
            159.848f,
            159.848f,

            160.112f,
            160.245f,
            160.377f,

            160.643f,
            160.776f,
            160.910f,
            160.910f,

            161.174f,
            161.304f,
            161.441f,

            161.703f,
            161.837f,
            161.968f,
            161.968f,
            162.238f,
            162.238f,

            162.501f,

            162.769f,
            162.911f,
            163.039f,
            163.039f,

            163.306f,
            163.436f,
            163.570f,

            163.831f,
            163.967f,
            164.098f,
            164.098f,

            164.368f,
            164.500f,
            164.629f,

            164.897f,
            165.033f,
            165.160f,
            165.160f,

            165.426f,
            165.560f,
            165.693f,

            165.955f,
            166.091f,
            166.226f,
            166.226f,
            166.486f,
            166.486f,

            166.757f,

            167.023f,
            167.148f,
            167.278f,
            167.278f,

            167.531f,
            167.679f,
            167.815f,

            168.083f,
            168.212f,
            168.342f,
            168.342f,

            168.614f,
            168.739f,
            168.866f,

            169.145f,
            169.272f,
            169.399f,
            169.399f,

            169.680f,
            169.807f,
            169.931f,

            170.200f,
            170.330f,
            170.466f,
            170.466f,
            170.729f,
            170.729f,

            170.997f,

            171.266f,
            171.404f,
            171.532f,
            171.532f,

            171.799f,
            171.935f,
            172.061f,

            172.333f,
            172.464f,
            172.594f,
            172.594f,

            172.844f,
            172.980f,
            173.131f,

            173.399f,
            173.531f,
            173.656f,
            173.656f,

            173.928f,
            174.057f,
            174.193f,

            174.457f,
            174.592f,
            174.720f,
            174.720f,

            174.987f,
            175.119f,
            175.253f,

            175.512f,
            175.639f,
            175.775f,
            175.775f,

            176.064f,
            176.192f,
            176.315f,

            176.597f,
            176.708f,
            176.835f,
            176.835f,

            177.126f,
            177.245f,
            177.368f,

            177.636f,
            177.766f,
            177.893f,
            177.893f,

            178.190f,
            178.309f,
            178.430f,

            178.696f,
            178.827f,
            178.959f,
            178.959f,
            179.216f,
            179.216f,

            179.494f,

            179.760f,
            179.904f,
            180.027f,
            180.027f,

            180.295f,
            180.433f,
            180.558f,

            180.826f,
            180.956f,
            181.093f,
            181.093f,

            181.357f,
            181.487f,
            181.622f,

            181.884f,
            182.017f,
            182.153f,
            182.153f,

            182.417f,
            182.553f,
            182.684f,

            182.946f,
            183.088f,
            183.215f,
            183.215f,
            183.479f,
            183.479f,

            183.750f,

            184.010f,
            184.143f,
            184.267f,
            184.267f,

            184.534f,
            184.666f,
            184.802f,

            185.088f,
            185.210f,
            185.329f,
            185.329f,

            185.596f,
            185.730f,
            185.862f,

            186.140f,
            186.261f,
            186.395f,
            186.395f,

            186.671f,
            186.796f,
            186.922f,

            187.193f,
            187.333f,
            187.465f,
            187.465f,
            187.722f,
            187.722f,

            // SOLO A
            188.000f,

            190.908f,
            191.050f,
            191.050f,
            191.446f,
            191.703f,
            191.979f,
            192.249f,

            194.361f,
            194.361f,
            194.361f,
            194.361f,

            196.224f,
            196.494f,
            196.747f,
            197.005f,
            197.163f,
            197.560f,
            197.560f,

            198.632f,
            199.675f,
            200.468f,
            200.739f,
            200.739f,

            // OUTRO
            205.003f,
            205.003f,

            205.247f,
            205.247f,

            205.516f,
            205.516f,

            205.783f,
            205.783f,

            206.053f,
            206.053f,

            206.180f,
            206.180f,

            206.307f,
            206.307f,

            206.579f,
            206.579f,
    };

    static float[] positions = {
            // INTRO (LEFT - RIGHT - LEFT - RIGHT)
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            // MIDDLE - DOUBLE_TAPPER A
            7 * slotLength, 1 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            7 * slotLength, 1 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            7 * slotLength, 1 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            7 * slotLength, 1 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            // MIDDLE - DOUBLE_TAPPER B
            2 * slotLength, 1 * slotLength,
            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,

            2 * slotLength, 1 * slotLength,
            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,

            2 * slotLength, 1 * slotLength,
            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,

            2 * slotLength, 1 * slotLength,
            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,

            // MIDDLE - DOUBLE_TAPPER C
            4 * slotLength, 1 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,

            4 * slotLength, 1 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,

            4 * slotLength, 1 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,

            4 * slotLength, 1 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,

            // MIDDLE - DOUBLE_TAPPER C
            4 * slotLength, 2 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,

            4 * slotLength, 2 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,

            4 * slotLength, 2 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,

            4 * slotLength, 2 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,

            // ONE - TWO - DOUBLE A
            6 * slotLength, 1 * slotLength,
            7 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            6 * slotLength, 1 * slotLength,
            7 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            6 * slotLength, 1 * slotLength,
            7 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            6 * slotLength, 1 * slotLength,
            7 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            // ONE - TWO - DOUBLE B
            1 * slotLength, 1 * slotLength,
            2 * slotLength, 2 * slotLength,
            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 2 * slotLength,
            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 2 * slotLength,
            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 2 * slotLength,
            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,

            // ONE - TWO - DOUBLE C
            4 * slotLength, 1 * slotLength,
            5 * slotLength, 2 * slotLength,
            4 * slotLength, 3 * slotLength,
            6 * slotLength, 3 * slotLength,

            4 * slotLength, 1 * slotLength,
            5 * slotLength, 2 * slotLength,
            4 * slotLength, 3 * slotLength,
            6 * slotLength, 3 * slotLength,

            4 * slotLength, 1 * slotLength,
            5 * slotLength, 2 * slotLength,
            4 * slotLength, 3 * slotLength,
            6 * slotLength, 3 * slotLength,

            4 * slotLength, 1 * slotLength,
            5 * slotLength, 2 * slotLength,
            4 * slotLength, 3 * slotLength,
            6 * slotLength, 3 * slotLength,
            4 * slotLength, 4 * slotLength,
            6 * slotLength, 4 * slotLength,

            // ONE - TWO - DOUBLE D
            5 * slotLength, 1 * slotLength,
            6 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            5 * slotLength, 1 * slotLength,
            6 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            8 * slotLength, 2 * slotLength,

            5 * slotLength, 1 * slotLength,
            4 * slotLength, 2 * slotLength,
            6 * slotLength, 2 * slotLength,
            4 * slotLength, 3 * slotLength,
            6 * slotLength, 3 * slotLength,
            4 * slotLength, 4 * slotLength,
            6 * slotLength, 4 * slotLength,

            // SOLO A
            4 * slotLength, 1 * slotLength,

            5 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            7 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,
            5 * slotLength, 2 * slotLength,
            3 * slotLength, 1 * slotLength,

            1 * slotLength, 3 * slotLength,
            2 * slotLength, 2 * slotLength,
            4 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,

            2 * slotLength, 1 * slotLength,
            6 * slotLength, 3 * slotLength,
            4 * slotLength, 3 * slotLength,
            2 * slotLength, 3 * slotLength,
            4 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,

            2 * slotLength, 1 * slotLength,
            1 * slotLength, 0 * slotLength,
            5 * slotLength, 2 * slotLength,
            3 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            // SOLO B
            3 * slotLength, 1 * slotLength,

            8 * slotLength, 4 * slotLength,
            6 * slotLength, 4 * slotLength,
            5 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            4 * slotLength, 3 * slotLength,
            3 * slotLength, 2 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 4 * slotLength,

            5 * slotLength, 3 * slotLength,
            8 * slotLength, 4 * slotLength,
            6 * slotLength, 4 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 2 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 4 * slotLength,

            5 * slotLength, 1 * slotLength,
            6 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,
            6 * slotLength, 4 * slotLength,
            7 * slotLength, 3 * slotLength,

            5 * slotLength, 2 * slotLength,
            7 * slotLength, 4 * slotLength,
            4 * slotLength, 3 * slotLength,
            6 * slotLength, 3 * slotLength,

            // TRIPLES A
            5 * slotLength, 0 * slotLength,
            3 * slotLength, 0 * slotLength,
            1 * slotLength, 0 * slotLength,
            5 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            1 * slotLength, 1 * slotLength,

            5 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            1 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            1 * slotLength, 3 * slotLength,

            8 * slotLength, 3 * slotLength,
            6 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,

            5 * slotLength, 0 * slotLength,
            3 * slotLength, 0 * slotLength,
            1 * slotLength, 0 * slotLength,
            5 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            1 * slotLength, 1 * slotLength,

            5 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            1 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            1 * slotLength, 3 * slotLength,

            8 * slotLength, 3 * slotLength,
            6 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,

            // TRIPLES B
            5 * slotLength, 0 * slotLength,
            3 * slotLength, 0 * slotLength,
            1 * slotLength, 0 * slotLength,
            5 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            1 * slotLength, 1 * slotLength,

            5 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            1 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            1 * slotLength, 3 * slotLength,

            8 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 2 * slotLength,

            5 * slotLength, 0 * slotLength,
            3 * slotLength, 0 * slotLength,
            1 * slotLength, 0 * slotLength,
            5 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            1 * slotLength, 1 * slotLength,

            5 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            1 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            1 * slotLength, 3 * slotLength,

            8 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 2 * slotLength,

            // TRIPLES C
            5 * slotLength, 0 * slotLength,
            3 * slotLength, 0 * slotLength,
            1 * slotLength, 0 * slotLength,
            5 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            1 * slotLength, 1 * slotLength,

            5 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            1 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            1 * slotLength, 3 * slotLength,

            8 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,
            8 * slotLength, 4 * slotLength,
            6 * slotLength, 3 * slotLength,

            5 * slotLength, 0 * slotLength,
            3 * slotLength, 0 * slotLength,
            1 * slotLength, 0 * slotLength,
            5 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            1 * slotLength, 1 * slotLength,

            5 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            1 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            1 * slotLength, 3 * slotLength,

            8 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,
            8 * slotLength, 4 * slotLength,
            6 * slotLength, 3 * slotLength,

            //TRIPLES D
            5 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            1 * slotLength, 4 * slotLength,
            5 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            1 * slotLength, 3 * slotLength,

            5 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            1 * slotLength, 2 * slotLength,
            5 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            1 * slotLength, 1 * slotLength,

            8 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 2 * slotLength,

            5 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            1 * slotLength, 4 * slotLength,
            5 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            1 * slotLength, 3 * slotLength,

            5 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            1 * slotLength, 2 * slotLength,
            5 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            1 * slotLength, 1 * slotLength,

            8 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 2 * slotLength,

            // DOUBLES
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 2 * slotLength,
            1 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,

            3 * slotLength, 0 * slotLength,
            5 * slotLength, 0 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 2 * slotLength,
            1 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,

            1 * slotLength, 0 * slotLength,
            2 * slotLength, 0 * slotLength,
            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            4 * slotLength, 2 * slotLength,
            6 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,

            2 * slotLength, 2 * slotLength,
            6 * slotLength, 2 * slotLength,
            1 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            2 * slotLength, 1 * slotLength,
            6 * slotLength, 1 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 2 * slotLength,
            1 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            1 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            // QUADRUPLES
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            1 * slotLength, 4 * slotLength,
            3 * slotLength, 4 * slotLength,
            5 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            1 * slotLength, 1 * slotLength,
            3 * slotLength, 1 * slotLength,
            5 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,
            8 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            3 * slotLength, 3 * slotLength,
            5 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            // DRUMS
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 4 * slotLength,
            8 * slotLength, 4 * slotLength,

            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 4 * slotLength,
            8 * slotLength, 4 * slotLength,

            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 4 * slotLength,
            8 * slotLength, 4 * slotLength,

            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 4 * slotLength,
            8 * slotLength, 4 * slotLength,

            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 4 * slotLength,
            8 * slotLength, 4 * slotLength,

            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            1 * slotLength, 1 * slotLength,
            2 * slotLength, 1 * slotLength,
            7 * slotLength, 1 * slotLength,

            1 * slotLength, 2 * slotLength,
            2 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,
            6 * slotLength, 4 * slotLength,
            8 * slotLength, 4 * slotLength,

            // SOLO A
            4 * slotLength, 1 * slotLength,

            5 * slotLength, 2 * slotLength,
            6 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,
            7 * slotLength, 2 * slotLength,
            6 * slotLength, 1 * slotLength,
            5 * slotLength, 2 * slotLength,
            3 * slotLength, 1 * slotLength,

            1 * slotLength, 3 * slotLength,
            2 * slotLength, 2 * slotLength,
            4 * slotLength, 2 * slotLength,
            5 * slotLength, 3 * slotLength,

            2 * slotLength, 1 * slotLength,
            6 * slotLength, 3 * slotLength,
            4 * slotLength, 3 * slotLength,
            2 * slotLength, 3 * slotLength,
            4 * slotLength, 2 * slotLength,
            3 * slotLength, 2 * slotLength,
            5 * slotLength, 2 * slotLength,

            2 * slotLength, 1 * slotLength,
            1 * slotLength, 0 * slotLength,
            5 * slotLength, 2 * slotLength,
            3 * slotLength, 3 * slotLength,
            7 * slotLength, 3 * slotLength,

            // OUTRO
            3 * slotLength, 1 * slotLength,
            6 * slotLength, 1 * slotLength,

            2 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            3 * slotLength, 3 * slotLength,
            6 * slotLength, 3 * slotLength,

            2 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,

            3 * slotLength, 1 * slotLength,
            6 * slotLength, 1 * slotLength,

            2 * slotLength, 2 * slotLength,
            7 * slotLength, 2 * slotLength,

            1 * slotLength, 3 * slotLength,
            8 * slotLength, 3 * slotLength,

            2 * slotLength, 4 * slotLength,
            7 * slotLength, 4 * slotLength,
    };
}
