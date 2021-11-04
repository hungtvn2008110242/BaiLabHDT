package com.hungtv2008110242.kiemtragiuaky;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy danhSachQuanLy = new DanhSachQuanLy();
        Nguoi nguoi = new Nguoi();
        nguoi.nhapThongTin();
        nguoi.xuatThongTin();
        System.out.println("===================");

        HocVien hocVien = new HocVien();
        hocVien.setDiemMonHoc1(7);
        hocVien.setDiemMonHoc2(8);
        hocVien.setHoTen("Nguyễn Hưng");
        hocVien.setDiaChi("47/16 Nayder, P.Phù Đổng, tp PleiKu");
        hocVien.setSoLuongHV(20);
        danhSachQuanLy.them(hocVien);
        System.out.println("===================");

        KhachHang khachHang = new KhachHang();
        khachHang.setHoTen("Nguyễn Văn B");
        khachHang.setDiaChi("123 ĐỐng đa, ba đình");
        khachHang.setTenCongTy("Công Ty TNHH 123");
        khachHang.setTriGiaHoaDon(250000);
        System.out.println("===================");

        NhanVien nhanVien = new NhanVien();
        nhanVien.getHeSoLuong(5);
        nhanVien.setDiaChi("4164564 NayDer, tp Pleiku");
        nhanVien.setHoTen("Nguyễn Văn A");
        danhSachQuanLy.them(nhanVien);
        System.out.println("===================");
    }
}
