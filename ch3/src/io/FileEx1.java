package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        // 경로 지정 : /(unix 계열) or \(windows)
        // \n, \t ==> 경로지정하는 것과 구별하기 위해서 \\ 두번 사용한다!
        // File file = new File("c:\\temp\\file1.txt");
        // File file = new File("c:\\temp", "file1.txt");
        File parent = new File("c:\\temp");
        File file = new File(parent, "file1.txt");
        // File file = new File("c:/temp/file1.txt");

        String name = file.getName();
        int pos = name.lastIndexOf(".");
        System.out.println("파일명 : " + name); // file1.txt
        // 확장자를 제외한 이름 추출
        System.out.println("확장자를 제외한 이름 : " + name.substring(0, pos));
        System.out.println("확장자 : " + name.substring(pos) + 1);
        System.out.println("경로를 포함한 파일명 : " + file.getPath());
        System.out.println("파일이 속해있는 디렉토리 : " + file.getParent());
        System.out.println("파일 pathSeparator : " + file.pathSeparator);
        System.out.println("파일 pathSeparatorChar : " + file.pathSeparatorChar);
        System.out.println("파일 Separator : " + file.separator);
        System.out.println("파일 SeparatorChar : " + file.separatorChar);
    }
}
