package DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class KhachHangDTO {
    @NotNull(message = "Không được để trống MSSV")
    private String MaKH;

    @NotNull(message = "Không được để trống MatKhau")
    private String MatKhau;

    @NotBlank(message = "Không được để trống Tên Khach Hang")
    private String TenKH;

    @NotNull(message = "Không được để trống SDT")
    private String SDT;

    @Email(message = "Không được để trống mail Và mail phải hợp lệ ")
    @NotNull(message = "Không được để trống mail")
    private String Email;

    @NotNull(message = "Không được để trống Giới Tính")
    private byte GioiTinh;



    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenSv(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public byte getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(byte GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
}
