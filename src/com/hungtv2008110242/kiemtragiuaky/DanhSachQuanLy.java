package com.hungtv2008110242.kiemtragiuaky;

import java.util.ArrayList;
import java.util.List;

public class DanhSachQuanLy {
    private ArrayList<Nguoi> danhSach = new ArrayList<Nguoi>();

    public void them(Nguoi nguoi) {
        this.danhSach.add(nguoi);
    }

    public void inDanhSach() {
        System.out.println(danhSach);
    }
}
