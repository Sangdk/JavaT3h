package com.t3h.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileManager {
    private int i = 0;

    public void manager() {
        try {
            String path = "E:/T3h/Android/Java/1902.txt";
            File f = new File(path);
            boolean exists = f.exists();
            System.out.println(exists);
            if (exists == false) {
                File parent = f.getParentFile();
                parent.mkdirs();
                f.createNewFile();
                System.out.println("Tao file thanh cong");
            } else {
                f.delete();
                System.out.println("Xoa file thanh cong");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readALLFile() {
        File f = new File("E:/xampp/htdocs/golgonphp/assets/images/products");
        readFileInfor(f);
    }

    private void readFileInfor(File f) {
        try {
            for (File file : f.listFiles()) {
                if (file.isFile() && !file.getName().equals("LG-27UD681539175923929.jpg")) {
                    i++;
//                    SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy HH: mm");

                    System.out.println("UPDATE products SET `pimage`=" +"'"+ file.getName()+"'" + " WHERE pid = " + i + ";");
//                    System.out.print("Name: " + file.getName()+',');
//                    String time = format.format(new Date(file.lastModified()));
//                    System.out.println("\tTime: " + format.format(new Date(file.lastModified())));
//                    System.out.println("\tPatch: "+file.getPath());
                } else {
                    readFileInfor(file);
                }
            }
        } catch (Exception e) {

        }
    }

    public void writeFile() {
        try {
            //tro vao file
            File f = new File("E:/T3h/Android/Java/1902.txt");
            if (f.exists() == false) {
                f.getParentFile().mkdirs();
                f.createNewFile();
            }
            //mo luong
            FileOutputStream out = new FileOutputStream(f, true);
            //ghi file
            String str = "Hello world\n";
            out.write(str.getBytes());
            //dong luong
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readFile() {
        try {
            File f = new File("E:/T3h/Android/Java/1902.txt");
            if (f.exists() == false) {
                System.out.println("File chua ton tai");
                return;
            }
            FileInputStream in = new FileInputStream(f);
            byte[] b = new byte[1024];
            int count = in.read(b);
            String s = "";
            while (count != -1) {
                s = new String(b, 0, count);
                count = in.read(b);
            }
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void replacee() {
        String a =
                "(13, 'Keyboard Dare-U EK880 RGB 2019 - Black', 780000, 2, 'DareU', 'Keyboard', '', 'https://product.hstatic.net/1000026716/product/ek880_1_3495448427dc4b64b943d53f5cb72fe1_large.jpg'),\n" +
                "(14, 'Keyboard Fuhlen M87S RGB', 890000, 2, 'Fuhlen', 'Keyboard', '', 'https://product.hstatic.net/1000026716/product/gearvn-fuhlen-m87s-1_large.jpg'),\n" +
                "(15, 'Keyboard Gaming DareU DK1280 RGB', 990000, 2, 'DareU', 'Keyboard', '', 'https://product.hstatic.net/1000026716/product/gearvn_dareu1280_avatar_large.png'),\n" +
                "(16, 'Keyboard Fuhlen D (Destroyer)', 990000, 2, 'Fuhlen', 'Keyboard', '', 'https://product.hstatic.net/1000026716/product/test_03731e4f82234eb4ad12d953fc4f183c_large.jpg'),\n" +
                "(17, 'Keyboard Gaming DareU EK1280 RGB 2019', 1080000, 2, 'DareU', 'Keyboard', '', 'https://product.hstatic.net/1000026716/product/1280_1_8a65342e507f4785ab3e71a3bda62921_large.png'),\n" +
                "(18, 'Keyboard Rapoo V720 RGB', 1090000, 2, 'Rapoo', 'Keyboard', '', 'https://product.hstatic.net/1000026716/product/rapoo-v720s-gearvn_large.jpg'),\n" +
                "(19, 'Keyboard Fuhlen Subverter RGB', 1140000, 2, 'Fuhlen', 'Keyboard', '', 'https://product.hstatic.net/1000026716/product/gearvn_fuhlen_subverter_2gearvn_fuhlen_subverter_3_b54cd3be57eb4a05ad7979769afe9f22_large.jpg'),\n" +
                "(20, 'Keyboard Fuhlen G87 (Cherry Switches)', 1390000, 2, 'Fuhlen', 'Keyboard', '', 'https://product.hstatic.net/1000026716/product/gearvn-g87_large.jpg'),\n" +
                "(21, 'AMD Athlon™ 200GE 3.2GHz / 2 nhân 4 luồng / Radeon™ Vega 3 Graphics', 1460000, 2, 'AMD', 'CPU', '', 'https://product.hstatic.net/1000026716/product/gearvn_cpu_amd_large.jpg'),\n" +
                "(22, 'AMD Ryzen 3 2200G 3.5 GHz tích hợp VGA Radeon Vega 8/6MB/4 nhân 4 luồng', 2590000, 2, 'AMD', 'CPU', '', 'https://product.hstatic.net/1000026716/product/gearvn_amd_ryzen_3_2200g_3.5__2__large.jpg'),\n" +
                "(23, 'AMD Ryzen 5 2400G 3.6 GHz tích hợp VGA Radeon Vega 11/6MB /4 nhân 8 luồng', 4090000, 2, 'AMD', 'CPU', '', 'https://product.hstatic.net/1000026716/product/gearvn_amd_ryzen_5_2400g_3.6_ghz_a6c966b66cc743bb9f96e7559c0d99a8_large.jpg'),\n" +
                "(24, 'AMD Threadripper™ 2920X Socket TR4', 16800000, 2, 'AMD', 'CPU', '', 'https://product.hstatic.net/1000026716/product/threadripper_2970wx_gearvn_ac511b4f80524b1e9c0d75383fd5a8ba_large.jpg'),\n" +
                "(25, 'AMD Threadripper™ 2970WX Socket TR4', 34300000, 2, 'AMD', 'CPU', '', 'https://product.hstatic.net/1000026716/product/threadripper_2970wx_gearvn_large.jpg'),\n" +
                "(26, 'Core i5 9400F / 9M / 2.9GHz / 6 nhân 6 luồng', 4590000, 2, 'Intel', 'CPU', '', 'https://product.hstatic.net/1000026716/product/i5_9400_gearvn12_large.jpg'),\n" +
                "(27, 'CPU AMD Ryzen 5 2600/ 6 nhân 12 luồng/ SK AM4', 5050000, 3, 'AMD', 'CPU', '', 'https://product.hstatic.net/1000026716/product/ryzen_5_large.jpg'),\n" +
                "(28, 'CPU AMD Ryzen 5 2600X / 6 nhân 12 luồng/ SK AM4', 5690000, 3, 'AMD', 'CPU', '', 'https://product.hstatic.net/1000026716/product/ryzen_5_3763d84dca9f4585b255d0b4956d5ff5_large.jpg'),\n" +
                "(29, 'CPU AMD Ryzen 7 2700/ 8 nhân 16 luồng/ SK AM4', 7900000, 2, 'AMD', 'CPU', '', 'https://product.hstatic.net/1000026716/product/ryzen_7_large.png'),\n" +
                "(30, 'CPU AMD Ryzen 7 2700X / 8 nhân 16 luồng/ SK AM4', 8650000, 3, 'AMD', 'CPU', '', 'https://product.hstatic.net/1000026716/product/ryzen_2700x_best_overall_gaming_cpu_2018_1000x1000pixels_large.png'),\n" +
                "(31, 'MSI GeForce® GTX 1050 Ti AERO ITX OC 4GD5', 4190000, 3, 'MSI', 'VGA', '', 'https://product.hstatic.net/1000026716/product/gtx1050ti_aero_gearvn_90551edd91594b749b8a556b80a23387_large.png'),\n" +
                "(32, 'GIGABYTE GTX 1050 Ti WindForce OC 4GB GDDR5 128bit', 4690000, 5, 'Gigabyte', 'VGA', '', 'https://product.hstatic.net/1000026716/product/gigabyte_1050_ti_winforce_gearvn_0_large.jpg'),\n" +
                "(33, 'Asus ROG Strix GeForce® GTX 1050 Ti OC 4GD5 Gaming 128bit', 4890000, 4, 'Asus', 'VGA', '', 'https://product.hstatic.net/1000026716/product/814ny-jo8fl._sl1500__large.jpg'),\n" +
                "(34, 'ASUS Phoenix GTX 1660 OC edition 6GB GDDR5', 6240000, 3, 'Asus', 'VGA', '', 'https://product.hstatic.net/1000026716/product/ph1660_gearvn_53f9516998f44b71860d40d4a219f4e6_large.png'),\n" +
                "(35, 'GIGABYTE GeForce GTX™ 1660 OC 6G', 6500000, 7, 'Gigabyte', 'VGA', '', 'https://product.hstatic.net/1000026716/product/giga_1660_oc_gearvn_77930f3e488b49b68a18c4f874d78892_large.png'),\n" +
                "(36, 'MSI GTX 1660 Ventus XS 6G OC GDDR5', 6790000, 4, 'MSI', 'VGA', '', 'https://product.hstatic.net/1000026716/product/gtx_1660_ventus_xs_gearvn_8cbfd7128b934389b9175487724a51ed_large.png'),\n" +
                "(37, 'ASUS TUF GTX 1660 OC edition 6G Gaming GDDR5', 6840000, 3, 'Asus', 'VGA', '', 'https://product.hstatic.net/1000026716/product/tuf_gtx1660_o6g_gaming_box_vga_acc_ff055808694744ddb9ab095d5647d83e_large.png'),\n" +
                "(38, 'GIGABYTE GeForce GTX™ 1660 Gaming OC 6G', 6990000, 7, 'Gigabyte', 'VGA', '', 'https://product.hstatic.net/1000026716/product/gv_n1660gaming_oc_6gd_candb_3f58ec338f574b569d6fbdd70e07cb3c_large.png'),\n" +
                "(39, 'MSI GTX 1660 GAMING X 6G GDDR5', 7150000, 5, 'MSI', 'VGA', '', 'https://product.hstatic.net/1000026716/product/msi_gtx_1660_gaming_x_gearvn_d18ffac8bfa948e497fa8f84335d218c_large.png'),\n" +
                "(40, 'INNO3D GTX 1660 Ti TWIN X2 GDDR6', 7500000, 6, 'Twin', 'VGA', '', 'https://product.hstatic.net/1000026716/product/1660ti_invo_gearvn_3c66f62eb1ac43b39f27dde8400ff9f9_large.png'),\n" +
                "(41, 'H310CM DVS LGA 1151v2', 1290000, 4, 'Asrock', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/h310cm-dvs_gearvn_large.png'),\n" +
                "(42, 'Asrock H310CM HDV LGA 1151v2', 1390000, 5, 'Asrock', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/asrock_h310cm-hdv_gearvn_large.jpg'),\n" +
                "(43, 'Asus Prime H310M-E LGA1151v2', 1500000, 5, 'Asus', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/prime_h310m-e__with_box_large.png'),\n" +
                "(44, 'GIGABYTE B360M AORUS PRO LGA1151v2', 2090000, 5, 'Gigabyte', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/b360m_aorus_pro_gearvn_large.jpg'),\n" +
                "(45, 'GIGABYTE B360M AORUS GAMING 3 LGA1151v2', 2090000, 5, 'Gigabyte', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/b360m_aorus_gaming_3_gearvn_0_large.jpg'),\n" +
                "(46, 'Asrock B360M Pro4 LGA 1151v2', 2090000, 7, 'Asrock', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/b360m_pro4_gearvn_large.jpg'),\n" +
                "(47, 'Asus B360G ROG STRIX Gaming LGA 1151v2', 2290000, 5, 'Asus', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/asus_b360g_gearvn00_large.jpg'),\n" +
                "(48, 'MSI B360M Mortar LGA1151v2', 2290000, 6, 'MSI', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/msi_b360m_mortar_gearvn1_large.jpg'),\n" +
                "(49, 'MSI B360M Mortar Titanium LGA1151v2', 2890000, 6, 'MSI', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/b360m_mortar_titanium_gearvn1_large.jpg'),\n" +
                "(50, 'GIGABYTE B360 AORUS GAMING 3 LGA1151V2', 2890000, 5, 'Gigabyte', 'Mainboard', '', 'https://product.hstatic.net/1000026716/product/b360_aorus_gaming_3_22_large.jpg');";
        String s = a.replace(" 'https://product.hstatic.net/1000026716/product/"," '");
        System.out.println(s);
    }
}
