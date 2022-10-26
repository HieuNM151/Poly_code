USE [master]
GO
/****** Object:  Database [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041]    Script Date: 10/25/2022 4:47:43 PM ******/
CREATE DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET ARITHABORT OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET  ENABLE_BROKER 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET  MULTI_USER 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET DB_CHAINING OFF 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET QUERY_STORE = OFF
GO
USE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041]
GO
/****** Object:  Table [dbo].[ChiTietSP]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietSP](
	[Id] [uniqueidentifier] NOT NULL,
	[IdSP] [uniqueidentifier] NULL,
	[IdNsx] [uniqueidentifier] NULL,
	[IdMauSac] [uniqueidentifier] NULL,
	[IdDongSP] [uniqueidentifier] NULL,
	[NamBH] [int] NULL,
	[MoTa] [nvarchar](50) NULL,
	[SoLuongTon] [int] NULL,
	[GiaNhap] [decimal](20, 0) NULL,
	[GiaBan] [decimal](20, 0) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[Id] [uniqueidentifier] NOT NULL,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CuaHang]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CuaHang](
	[Id] [uniqueidentifier] NOT NULL,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[ThanhPho] [nvarchar](50) NULL,
	[QuocGia] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DongSP]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DongSP](
	[Id] [uniqueidentifier] NOT NULL,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GioHang]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GioHang](
	[Id] [uniqueidentifier] NOT NULL,
	[IdKH] [uniqueidentifier] NULL,
	[IdNV] [uniqueidentifier] NULL,
	[Ma] [varchar](20) NULL,
	[NgayTao] [date] NULL,
	[NgayThanhToan] [date] NULL,
	[TenNguoiNhan] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Sdt] [varchar](30) NULL,
	[TinhTrang] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GioHangChiTiet]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GioHangChiTiet](
	[IdGioHang] [uniqueidentifier] NOT NULL,
	[IdChiTietSP] [uniqueidentifier] NOT NULL,
	[SoLuong] [int] NULL,
	[DonGia] [decimal](20, 0) NULL,
	[DonGiaKhiGiam] [decimal](20, 0) NULL,
	[ThanhTien] [decimal](18, 0) NULL,
 CONSTRAINT [PK_GioHangCT] PRIMARY KEY CLUSTERED 
(
	[IdGioHang] ASC,
	[IdChiTietSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[Id] [uniqueidentifier] NOT NULL,
	[IdKH] [uniqueidentifier] NULL,
	[IdNV] [uniqueidentifier] NULL,
	[Ma] [varchar](20) NULL,
	[NgayTao] [date] NULL,
	[NgayThanhToan] [date] NULL,
	[NgayShip] [date] NULL,
	[NgayNhan] [date] NULL,
	[TinhTrang] [int] NULL,
	[TenNguoiNhan] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Sdt] [varchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[IdHoaDon] [uniqueidentifier] NOT NULL,
	[IdChiTietSP] [uniqueidentifier] NOT NULL,
	[SoLuong] [int] NULL,
	[DonGia] [decimal](20, 0) NULL,
 CONSTRAINT [PK_HoaDonCT] PRIMARY KEY CLUSTERED 
(
	[IdHoaDon] ASC,
	[IdChiTietSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[Id] [uniqueidentifier] NOT NULL,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
	[TenDem] [nvarchar](30) NULL,
	[Ho] [nvarchar](30) NULL,
	[NgaySinh] [date] NULL,
	[Sdt] [varchar](30) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[ThanhPho] [nvarchar](50) NULL,
	[QuocGia] [nvarchar](50) NULL,
	[MatKhau] [varchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MauSac]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MauSac](
	[Id] [uniqueidentifier] NOT NULL,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[Id] [uniqueidentifier] NOT NULL,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
	[TenDem] [nvarchar](30) NULL,
	[Ho] [nvarchar](30) NULL,
	[GioiTinh] [nvarchar](10) NULL,
	[NgaySinh] [date] NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Sdt] [varchar](30) NULL,
	[MatKhau] [varchar](max) NULL,
	[IdCH] [uniqueidentifier] NULL,
	[IdCV] [uniqueidentifier] NULL,
	[IdGuiBC] [uniqueidentifier] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NSX]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NSX](
	[Id] [uniqueidentifier] NOT NULL,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 10/25/2022 4:47:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[Id] [uniqueidentifier] NOT NULL,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChiTietSP] ([Id], [IdSP], [IdNsx], [IdMauSac], [IdDongSP], [NamBH], [MoTa], [SoLuongTon], [GiaNhap], [GiaBan]) VALUES (N'cb45a59e-ae17-41c9-8e9b-77e46a442f2d', N'bf5b9b3f-7be0-43e2-b163-1394c46e9b0b', N'55639074-8807-4e13-810e-568ea387cfe8', N'a2b5a2b1-e2f5-4c42-84b0-1de27407f8a3', N'd1ad5f53-0a55-459f-843a-03b3215f467e', 1, N'Bào hành', 122, CAST(100000 AS Decimal(20, 0)), CAST(120000 AS Decimal(20, 0)))
INSERT [dbo].[ChiTietSP] ([Id], [IdSP], [IdNsx], [IdMauSac], [IdDongSP], [NamBH], [MoTa], [SoLuongTon], [GiaNhap], [GiaBan]) VALUES (N'5b9978d3-7bd2-4aa6-90c2-8dd8f75f403d', N'7f8844a0-43c1-4426-a154-347467d9bf62', N'55f0a83f-4eef-4d72-9e86-82007da08639', N'8c8fd91b-e89c-4e08-acab-2a4481ea2b1e', N'bbce181e-db43-4da8-bacc-6ad8727300e1', 2, N'Bảo hàng', 123, CAST(234400 AS Decimal(20, 0)), CAST(350000 AS Decimal(20, 0)))
INSERT [dbo].[ChiTietSP] ([Id], [IdSP], [IdNsx], [IdMauSac], [IdDongSP], [NamBH], [MoTa], [SoLuongTon], [GiaNhap], [GiaBan]) VALUES (N'4ca53a63-0ceb-4976-83ab-96b6d50a61c9', N'690c0d9a-25cf-439f-8602-3bdaddce8e49', N'71949fa1-a3af-438d-b5ad-9b89570d929d', N'd86c6450-ec3e-41c8-aa19-55aa9e12cf61', N'8c490c0d-f649-4f27-828d-892baa3aff95', 2, N'Bảo Hàng', 1223, CAST(140000 AS Decimal(20, 0)), CAST(300000 AS Decimal(20, 0)))
INSERT [dbo].[ChiTietSP] ([Id], [IdSP], [IdNsx], [IdMauSac], [IdDongSP], [NamBH], [MoTa], [SoLuongTon], [GiaNhap], [GiaBan]) VALUES (N'2664b0ea-78fa-4003-b115-9b646f4e1297', N'2e8f4297-fdb4-4346-ac83-78e3968b35a9', N'05939282-03d1-42c4-98de-a5a2d61ceab0', N'61a145ad-ced9-4bfe-a1cb-c102f271b384', N'5cbca170-e978-4a08-bd1b-e95d69802dce', 2, N'Bao hanh', 12900, CAST(7 AS Decimal(20, 0)), CAST(230000 AS Decimal(20, 0)))
GO
INSERT [dbo].[ChucVu] ([Id], [Ma], [Ten]) VALUES (N'9773f20c-3d56-4789-afaa-37427867d261', N'CV01', N'Đức')
INSERT [dbo].[ChucVu] ([Id], [Ma], [Ten]) VALUES (N'48230cea-3c67-4973-bcd4-834de7e45dff', N'CV03', N'Tú')
INSERT [dbo].[ChucVu] ([Id], [Ma], [Ten]) VALUES (N'53e435c8-5567-4b2a-8f2f-c0da676357f3', N'CV02', N'Minh')
GO
INSERT [dbo].[CuaHang] ([Id], [Ma], [Ten], [DiaChi], [ThanhPho], [QuocGia]) VALUES (N'e9ad0a12-6592-4c41-a799-21a913ac206e', N'CH03', N'Cửa Hàng C', N'Hà Nội', N'Hà Nội', N'Việt Nam')
INSERT [dbo].[CuaHang] ([Id], [Ma], [Ten], [DiaChi], [ThanhPho], [QuocGia]) VALUES (N'ebf3d693-4a1f-49c4-b87a-aa022a4d3244', N'CH02', N'Cửa Hàng B', N'Hà Nội', N'Hà Nội', N'việt Nam')
INSERT [dbo].[CuaHang] ([Id], [Ma], [Ten], [DiaChi], [ThanhPho], [QuocGia]) VALUES (N'afdb0efc-f8c2-4646-b729-ed4c611e105c', N'CH01', N'Cửa Hàng A', N'Hà Nội', N'Hà Nội', N'việt nam')
GO
INSERT [dbo].[DongSP] ([Id], [Ma], [Ten]) VALUES (N'd1ad5f53-0a55-459f-843a-03b3215f467e', N'SP02', N'Sữa')
INSERT [dbo].[DongSP] ([Id], [Ma], [Ten]) VALUES (N'bbce181e-db43-4da8-bacc-6ad8727300e1', N'SP01', N'Gạo')
INSERT [dbo].[DongSP] ([Id], [Ma], [Ten]) VALUES (N'8c490c0d-f649-4f27-828d-892baa3aff95', N'SP03', N'Trà')
INSERT [dbo].[DongSP] ([Id], [Ma], [Ten]) VALUES (N'5cbca170-e978-4a08-bd1b-e95d69802dce', N'SP05', N'Xanh')
INSERT [dbo].[DongSP] ([Id], [Ma], [Ten]) VALUES (N'693ba5e2-ddb1-4138-be40-f915a9e6706e', N'SP04', N'Bánh')
GO
INSERT [dbo].[GioHang] ([Id], [IdKH], [IdNV], [Ma], [NgayTao], [NgayThanhToan], [TenNguoiNhan], [DiaChi], [Sdt], [TinhTrang]) VALUES (N'12522dfc-9209-44d2-b3d7-2f6e54186251', N'081752bb-859f-489b-a662-4792885d9271', N'2c71cd43-b11a-4c94-afc6-1bdc38f66612', N'GH01', CAST(N'2022-07-07' AS Date), CAST(N'2022-07-07' AS Date), N'Phong', N'Nghệ An', N'0937434333', 1)
INSERT [dbo].[GioHang] ([Id], [IdKH], [IdNV], [Ma], [NgayTao], [NgayThanhToan], [TenNguoiNhan], [DiaChi], [Sdt], [TinhTrang]) VALUES (N'e28c480e-986d-40dc-947b-54a7a3a34e77', N'628a754a-4eb4-4aa3-87d5-b2dcf2bb9d94', N'913ba9e2-4964-43f6-9b3f-a4fe1030c888', N'GH03', CAST(N'2022-09-26' AS Date), CAST(N'2022-09-26' AS Date), N'Hùng', N'Ninh Bình', N'0934384712', 1)
INSERT [dbo].[GioHang] ([Id], [IdKH], [IdNV], [Ma], [NgayTao], [NgayThanhToan], [TenNguoiNhan], [DiaChi], [Sdt], [TinhTrang]) VALUES (N'd2b9d066-35d4-4067-820e-f4821c4cf3b5', N'62a10121-1315-4b1f-928b-f445b57c8fab', N'7b4a0efd-e185-42c6-afc0-c78a22d81f87', N'GH02', CAST(N'2022-08-25' AS Date), CAST(N'2022-08-25' AS Date), N'Toàn', N'Phú Thọ', N'093743888', 1)
GO
INSERT [dbo].[GioHangChiTiet] ([IdGioHang], [IdChiTietSP], [SoLuong], [DonGia], [DonGiaKhiGiam], [ThanhTien]) VALUES (N'12522dfc-9209-44d2-b3d7-2f6e54186251', N'cb45a59e-ae17-41c9-8e9b-77e46a442f2d', 1, CAST(300000 AS Decimal(20, 0)), CAST(290000 AS Decimal(20, 0)), CAST(290000 AS Decimal(18, 0)))
INSERT [dbo].[GioHangChiTiet] ([IdGioHang], [IdChiTietSP], [SoLuong], [DonGia], [DonGiaKhiGiam], [ThanhTien]) VALUES (N'e28c480e-986d-40dc-947b-54a7a3a34e77', N'5b9978d3-7bd2-4aa6-90c2-8dd8f75f403d', 2, CAST(350000 AS Decimal(20, 0)), CAST(300000 AS Decimal(20, 0)), CAST(600000 AS Decimal(18, 0)))
INSERT [dbo].[GioHangChiTiet] ([IdGioHang], [IdChiTietSP], [SoLuong], [DonGia], [DonGiaKhiGiam], [ThanhTien]) VALUES (N'd2b9d066-35d4-4067-820e-f4821c4cf3b5', N'4ca53a63-0ceb-4976-83ab-96b6d50a61c9', 1, CAST(120000 AS Decimal(20, 0)), CAST(100000 AS Decimal(20, 0)), CAST(100000 AS Decimal(18, 0)))
GO
INSERT [dbo].[HoaDon] ([Id], [IdKH], [IdNV], [Ma], [NgayTao], [NgayThanhToan], [NgayShip], [NgayNhan], [TinhTrang], [TenNguoiNhan], [DiaChi], [Sdt]) VALUES (N'de897410-3920-402c-b921-798b4e4288d1', N'081752bb-859f-489b-a662-4792885d9271', N'2c71cd43-b11a-4c94-afc6-1bdc38f66612', N'HD02', CAST(N'2022-08-25' AS Date), CAST(N'2022-08-25' AS Date), CAST(N'2022-08-28' AS Date), CAST(N'2022-08-30' AS Date), 1, N'Toàn', N'Phú Thọ', N'0873464334')
INSERT [dbo].[HoaDon] ([Id], [IdKH], [IdNV], [Ma], [NgayTao], [NgayThanhToan], [NgayShip], [NgayNhan], [TinhTrang], [TenNguoiNhan], [DiaChi], [Sdt]) VALUES (N'248a6e6e-2c7e-4994-8555-8aabc56a9099', N'628a754a-4eb4-4aa3-87d5-b2dcf2bb9d94', N'913ba9e2-4964-43f6-9b3f-a4fe1030c888', N'HD01', CAST(N'2022-09-26' AS Date), CAST(N'2022-09-26' AS Date), CAST(N'2022-09-27' AS Date), CAST(N'2022-09-30' AS Date), 1, N'Hùng', N'Ninh Bình', N'0934384712')
INSERT [dbo].[HoaDon] ([Id], [IdKH], [IdNV], [Ma], [NgayTao], [NgayThanhToan], [NgayShip], [NgayNhan], [TinhTrang], [TenNguoiNhan], [DiaChi], [Sdt]) VALUES (N'af5a08c7-ea46-4369-826b-982d7335cd42', N'62a10121-1315-4b1f-928b-f445b57c8fab', N'7b4a0efd-e185-42c6-afc0-c78a22d81f87', N'HD03', CAST(N'2022-07-07' AS Date), CAST(N'2022-07-07' AS Date), CAST(N'2022-07-09' AS Date), CAST(N'2022-07-11' AS Date), 1, N'Phong', N'Nghệ An', N'0937434333')
GO
INSERT [dbo].[HoaDonChiTiet] ([IdHoaDon], [IdChiTietSP], [SoLuong], [DonGia]) VALUES (N'de897410-3920-402c-b921-798b4e4288d1', N'cb45a59e-ae17-41c9-8e9b-77e46a442f2d', 1, CAST(290000 AS Decimal(20, 0)))
INSERT [dbo].[HoaDonChiTiet] ([IdHoaDon], [IdChiTietSP], [SoLuong], [DonGia]) VALUES (N'248a6e6e-2c7e-4994-8555-8aabc56a9099', N'5b9978d3-7bd2-4aa6-90c2-8dd8f75f403d', 2, CAST(600000 AS Decimal(20, 0)))
INSERT [dbo].[HoaDonChiTiet] ([IdHoaDon], [IdChiTietSP], [SoLuong], [DonGia]) VALUES (N'af5a08c7-ea46-4369-826b-982d7335cd42', N'4ca53a63-0ceb-4976-83ab-96b6d50a61c9', 1, CAST(100000 AS Decimal(20, 0)))
GO
INSERT [dbo].[KhachHang] ([Id], [Ma], [Ten], [TenDem], [Ho], [NgaySinh], [Sdt], [DiaChi], [ThanhPho], [QuocGia], [MatKhau]) VALUES (N'081752bb-859f-489b-a662-4792885d9271', N'KH03', N'Hiếu', N'Vũ', N'Quang', CAST(N'2003-12-22' AS Date), N'0923723743', N'Hà Nội', N'Hà Nội', N'việt Nam', N'123')
INSERT [dbo].[KhachHang] ([Id], [Ma], [Ten], [TenDem], [Ho], [NgaySinh], [Sdt], [DiaChi], [ThanhPho], [QuocGia], [MatKhau]) VALUES (N'628a754a-4eb4-4aa3-87d5-b2dcf2bb9d94', N'KH01', N'Lâm', N'Xuân', N'Nguyễn', CAST(N'2003-11-29' AS Date), N'0377887665', N'Tây Hồ', N'Hà Nội', N'Việt Nam', N'123')
INSERT [dbo].[KhachHang] ([Id], [Ma], [Ten], [TenDem], [Ho], [NgaySinh], [Sdt], [DiaChi], [ThanhPho], [QuocGia], [MatKhau]) VALUES (N'62a10121-1315-4b1f-928b-f445b57c8fab', N'KH04', N'Đưc', N'Việt', N'Đỗ', CAST(N'2003-08-02' AS Date), N'0993473433', N'Hà Nội', N'Hà Nội', N'Hà Nội', N'123')
GO
INSERT [dbo].[MauSac] ([Id], [Ma], [Ten]) VALUES (N'a2b5a2b1-e2f5-4c42-84b0-1de27407f8a3', N'SP03', N'Màu Hồng')
INSERT [dbo].[MauSac] ([Id], [Ma], [Ten]) VALUES (N'8c8fd91b-e89c-4e08-acab-2a4481ea2b1e', N'SP06', N'tả')
INSERT [dbo].[MauSac] ([Id], [Ma], [Ten]) VALUES (N'd86c6450-ec3e-41c8-aa19-55aa9e12cf61', N'SP05', N'Màu Trắng')
INSERT [dbo].[MauSac] ([Id], [Ma], [Ten]) VALUES (N'61a145ad-ced9-4bfe-a1cb-c102f271b384', N'SP04', N'Màu Của trái Tim Em')
INSERT [dbo].[MauSac] ([Id], [Ma], [Ten]) VALUES (N'87ced4c2-02fe-42d5-b0c9-c2c29ac0b26c', N'SP02', N'Màu Sữa')
INSERT [dbo].[MauSac] ([Id], [Ma], [Ten]) VALUES (N'93ff9d7b-b64f-472a-bfff-d00bb7514324', N'SP01', N'Màu Hường')
GO
INSERT [dbo].[NhanVien] ([Id], [Ma], [Ten], [TenDem], [Ho], [GioiTinh], [NgaySinh], [DiaChi], [Sdt], [MatKhau], [IdCH], [IdCV], [IdGuiBC], [TrangThai]) VALUES (N'2c71cd43-b11a-4c94-afc6-1bdc38f66612', N'NV03', N'Tú', N'Anh', N'Hoàng', N'Nam', CAST(N'2003-12-02' AS Date), N'Ninh Bình', N'0294324434', N'123', N'e9ad0a12-6592-4c41-a799-21a913ac206e', N'9773f20c-3d56-4789-afaa-37427867d261', NULL, 1)
INSERT [dbo].[NhanVien] ([Id], [Ma], [Ten], [TenDem], [Ho], [GioiTinh], [NgaySinh], [DiaChi], [Sdt], [MatKhau], [IdCH], [IdCV], [IdGuiBC], [TrangThai]) VALUES (N'913ba9e2-4964-43f6-9b3f-a4fe1030c888', N'NV01', N'Đức', N'Công ', N'Hoàng', N'Nam', CAST(N'2003-08-28' AS Date), N'Phú Thọ', N'0971066455', N'123', N'ebf3d693-4a1f-49c4-b87a-aa022a4d3244', N'48230cea-3c67-4973-bcd4-834de7e45dff', NULL, 1)
INSERT [dbo].[NhanVien] ([Id], [Ma], [Ten], [TenDem], [Ho], [GioiTinh], [NgaySinh], [DiaChi], [Sdt], [MatKhau], [IdCH], [IdCV], [IdGuiBC], [TrangThai]) VALUES (N'7b4a0efd-e185-42c6-afc0-c78a22d81f87', N'NV02', N'Minh', N'Quang', N'Đặng', N'Nam', CAST(N'2003-09-22' AS Date), N'Thanh Hóa', N'0932748324', N'123', N'afdb0efc-f8c2-4646-b729-ed4c611e105c', N'53e435c8-5567-4b2a-8f2f-c0da676357f3', NULL, 1)
GO
INSERT [dbo].[NSX] ([Id], [Ma], [Ten]) VALUES (N'55639074-8807-4e13-810e-568ea387cfe8', N'NSX01', N'CTCP1')
INSERT [dbo].[NSX] ([Id], [Ma], [Ten]) VALUES (N'55f0a83f-4eef-4d72-9e86-82007da08639', N'NSX04', N'CTCP04')
INSERT [dbo].[NSX] ([Id], [Ma], [Ten]) VALUES (N'71949fa1-a3af-438d-b5ad-9b89570d929d', N'NSX02', N'CTCP2')
INSERT [dbo].[NSX] ([Id], [Ma], [Ten]) VALUES (N'05939282-03d1-42c4-98de-a5a2d61ceab0', N'NSX05', N'CTp05')
INSERT [dbo].[NSX] ([Id], [Ma], [Ten]) VALUES (N'226d26ed-ff37-47f2-8d82-df771e298f79', N'NS06', N'CTCP22')
INSERT [dbo].[NSX] ([Id], [Ma], [Ten]) VALUES (N'061a2aec-09fc-4fb6-b84b-f4dc66c6606a', N'NSX03', N'CTCP3')
GO
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten]) VALUES (N'bf5b9b3f-7be0-43e2-b163-1394c46e9b0b', N'SP02', N'Trà Sữa')
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten]) VALUES (N'7f8844a0-43c1-4426-a154-347467d9bf62', N'SP05', N'Traf')
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten]) VALUES (N'690c0d9a-25cf-439f-8602-3bdaddce8e49', N'SP04', N'Trà Trộn vào tim em')
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten]) VALUES (N'2e8f4297-fdb4-4346-ac83-78e3968b35a9', N'SP01', N'Trà Tranh')
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten]) VALUES (N'0ed1a2c3-989e-4895-b035-7cdabd1ad7bb', N'SP06', N'Trad')
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten]) VALUES (N'5a4945e9-5568-4b71-a3f4-ab7514fc7a9b', N'SP03', N'Trà Đào')
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__ChucVu__3214CC9EF0F0F5F2]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[ChucVu] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__CuaHang__3214CC9E1D00EFC0]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[CuaHang] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__DongSP__3214CC9EB8863889]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[DongSP] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__GioHang__3214CC9E14BB5F0E]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[GioHang] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__HoaDon__3214CC9EB42ED70C]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[HoaDon] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__KhachHan__3214CC9E8554468A]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[KhachHang] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__MauSac__3214CC9E8E0EB477]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[MauSac] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__NhanVien__3214CC9E134E659C]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[NhanVien] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__NSX__3214CC9E1BB5B0BD]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[NSX] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__SanPham__3214CC9E716626FA]    Script Date: 10/25/2022 4:47:44 PM ******/
ALTER TABLE [dbo].[SanPham] ADD UNIQUE NONCLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[ChiTietSP] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[ChiTietSP] ADD  DEFAULT (NULL) FOR [NamBH]
GO
ALTER TABLE [dbo].[ChiTietSP] ADD  DEFAULT (NULL) FOR [MoTa]
GO
ALTER TABLE [dbo].[ChiTietSP] ADD  DEFAULT ((0)) FOR [GiaNhap]
GO
ALTER TABLE [dbo].[ChiTietSP] ADD  DEFAULT ((0)) FOR [GiaBan]
GO
ALTER TABLE [dbo].[ChucVu] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[ChucVu] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[CuaHang] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[CuaHang] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[CuaHang] ADD  DEFAULT (NULL) FOR [DiaChi]
GO
ALTER TABLE [dbo].[CuaHang] ADD  DEFAULT (NULL) FOR [ThanhPho]
GO
ALTER TABLE [dbo].[CuaHang] ADD  DEFAULT (NULL) FOR [QuocGia]
GO
ALTER TABLE [dbo].[DongSP] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[GioHang] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[GioHang] ADD  DEFAULT (NULL) FOR [NgayTao]
GO
ALTER TABLE [dbo].[GioHang] ADD  DEFAULT (NULL) FOR [NgayThanhToan]
GO
ALTER TABLE [dbo].[GioHang] ADD  DEFAULT (NULL) FOR [TenNguoiNhan]
GO
ALTER TABLE [dbo].[GioHang] ADD  DEFAULT (NULL) FOR [DiaChi]
GO
ALTER TABLE [dbo].[GioHang] ADD  DEFAULT (NULL) FOR [Sdt]
GO
ALTER TABLE [dbo].[GioHang] ADD  DEFAULT ((0)) FOR [TinhTrang]
GO
ALTER TABLE [dbo].[GioHangChiTiet] ADD  DEFAULT ((0)) FOR [DonGia]
GO
ALTER TABLE [dbo].[GioHangChiTiet] ADD  DEFAULT ((0)) FOR [DonGiaKhiGiam]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (NULL) FOR [NgayTao]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (NULL) FOR [NgayThanhToan]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (NULL) FOR [NgayShip]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (NULL) FOR [NgayNhan]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT ((0)) FOR [TinhTrang]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (NULL) FOR [TenNguoiNhan]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (NULL) FOR [DiaChi]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (NULL) FOR [Sdt]
GO
ALTER TABLE [dbo].[HoaDonChiTiet] ADD  DEFAULT ((0)) FOR [DonGia]
GO
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT (NULL) FOR [TenDem]
GO
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT (NULL) FOR [Ho]
GO
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT (NULL) FOR [NgaySinh]
GO
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT (NULL) FOR [Sdt]
GO
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT (NULL) FOR [DiaChi]
GO
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT (NULL) FOR [ThanhPho]
GO
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT (NULL) FOR [QuocGia]
GO
ALTER TABLE [dbo].[KhachHang] ADD  DEFAULT (NULL) FOR [MatKhau]
GO
ALTER TABLE [dbo].[MauSac] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [TenDem]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [Ho]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [GioiTinh]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [NgaySinh]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [DiaChi]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [Sdt]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [MatKhau]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[NSX] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[ChiTietSP]  WITH CHECK ADD FOREIGN KEY([IdDongSP])
REFERENCES [dbo].[DongSP] ([Id])
GO
ALTER TABLE [dbo].[ChiTietSP]  WITH CHECK ADD FOREIGN KEY([IdMauSac])
REFERENCES [dbo].[MauSac] ([Id])
GO
ALTER TABLE [dbo].[ChiTietSP]  WITH CHECK ADD FOREIGN KEY([IdNsx])
REFERENCES [dbo].[NSX] ([Id])
GO
ALTER TABLE [dbo].[ChiTietSP]  WITH CHECK ADD FOREIGN KEY([IdSP])
REFERENCES [dbo].[SanPham] ([Id])
GO
ALTER TABLE [dbo].[GioHang]  WITH CHECK ADD FOREIGN KEY([IdKH])
REFERENCES [dbo].[KhachHang] ([Id])
GO
ALTER TABLE [dbo].[GioHangChiTiet]  WITH CHECK ADD  CONSTRAINT [FK1_IdGioHang] FOREIGN KEY([IdGioHang])
REFERENCES [dbo].[GioHang] ([Id])
GO
ALTER TABLE [dbo].[GioHangChiTiet] CHECK CONSTRAINT [FK1_IdGioHang]
GO
ALTER TABLE [dbo].[GioHangChiTiet]  WITH CHECK ADD  CONSTRAINT [FK2_IdChiTietSP] FOREIGN KEY([IdChiTietSP])
REFERENCES [dbo].[ChiTietSP] ([Id])
GO
ALTER TABLE [dbo].[GioHangChiTiet] CHECK CONSTRAINT [FK2_IdChiTietSP]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([IdKH])
REFERENCES [dbo].[KhachHang] ([Id])
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([IdNV])
REFERENCES [dbo].[NhanVien] ([Id])
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK1] FOREIGN KEY([IdHoaDon])
REFERENCES [dbo].[HoaDon] ([Id])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK1]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK2] FOREIGN KEY([IdChiTietSP])
REFERENCES [dbo].[ChiTietSP] ([Id])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK2]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD FOREIGN KEY([IdCH])
REFERENCES [dbo].[CuaHang] ([Id])
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD FOREIGN KEY([IdCV])
REFERENCES [dbo].[ChucVu] ([Id])
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD FOREIGN KEY([IdGuiBC])
REFERENCES [dbo].[NhanVien] ([Id])
GO
USE [master]
GO
ALTER DATABASE [FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041] SET  READ_WRITE 
GO
