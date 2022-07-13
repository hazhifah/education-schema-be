select * from kawahedukasi where gaji = (select max(gaji) from kawahedukasi)

select * from kawahedukasi where gaji = (select max(gaji) from kawahedukasi) AND nilai = (select max(nilai) from kawahedukasi)

select count(*) from kawahedukasi where kelas = 'FRONTEND'

select * from kawahedukasi where jumlah_kehadiran = (select max(jumlah_kehadiran) from kawahedukasi) AND nilai = (select max(nilai) from kawahedukasi)