package org.zsy.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author 张世一
 * @version 1.0
 */
public class GzipUtil {
//
//    /**
//     * 使用gzip进行压缩
//     */
//    public static String compress(String primStr) {
//        if (primStr == null || primStr.length() == 0) {
//            return primStr;
//        }
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        GZIPOutputStream gzip = null;
//        try {
//            gzip = new GZIPOutputStream(out);
//            gzip.write(primStr.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (gzip != null) {
//                try {
//                    gzip.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return new sun.misc.BASE64Encoder().encode(out.toByteArray());
//    }
//
//    /**
//     * 使用gzip进行解压缩
//     */
//    public static String uncompress(String compressedStr) {
//        if (compressedStr == null) {
//            return null;
//        }
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        ByteArrayInputStream in = null;
//        GZIPInputStream ginzip = null;
//        byte[] compressed = null;
//        String decompressed = null;
//        try {
//            compressed = new sun.misc.BASE64Decoder().decodeBuffer(compressedStr);
//            in = new ByteArrayInputStream(compressed);
//            ginzip = new GZIPInputStream(in);
//
//            byte[] buffer = new byte[1024];
//            int offset = -1;
//            while ((offset = ginzip.read(buffer)) != -1) {
//                out.write(buffer, 0, offset);
//            }
//            decompressed = out.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (ginzip != null) {
//                try {
//                    ginzip.close();
//                } catch (IOException e) {
//                }
//            }
//            if (in != null) {
//                try {
//                    in.close();
//                } catch (IOException e) {
//                }
//            }
//            try {
//                out.close();
//            } catch (IOException e) {
//            }
//        }
//        return decompressed;
//    }

    public static String compress(String primStr) throws IOException {
        if (primStr == null || primStr.length() == 0) {
            return primStr;
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        GZIPOutputStream gzip = null;
        try {
            gzip = new GZIPOutputStream(out);
            gzip.write(primStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (gzip != null) {
                try {
                    gzip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return new sun.misc.BASE64Encoder().encode(out.toByteArray());

    }

    public static String uncompress(String compressedStr) throws IOException {
        if (compressedStr == null) {
            return null;
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = null;
        GZIPInputStream ginzip = null;
        byte[] compressed = null;
        String decompressed = null;
        try {
            compressed = new sun.misc.BASE64Decoder().decodeBuffer(compressedStr);
            in = new ByteArrayInputStream(compressed);
            ginzip = new GZIPInputStream(in);

            byte[] buffer = new byte[1024];
            int offset = -1;
            while ((offset = ginzip.read(buffer)) != -1) {
                out.write(buffer, 0, offset);
            }
            decompressed = out.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ginzip != null) {
                try {
                    ginzip.close();
                } catch (IOException e) {
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }

        return decompressed;
    }

    public static void main(String[] args) throws Exception{
        String str = "899334 40 323495 5";
        System.out.println("原字符串：" + str);
        System.out.println("原长度：" + str.length());
        String compress = GzipUtil.compress(str);
        System.out.println("压缩后字符串：" + compress);
        System.out.println("压缩后字符串长度：" + compress.length());
        String string = GzipUtil.uncompress(compress);
        System.out.println("解压缩后字符串：" + string);
        System.out.println("解压缩后字符串：" + str);

    }

}
