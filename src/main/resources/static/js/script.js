document.addEventListener("DOMContentLoaded", function () {
  const flash = document.getElementById("flash-data");
  if (flash) {
    const jumlah = flash.dataset.jumlah;
    Swal.fire({
      title: "Anggaran Ditambahkan!",
      text: "Sebesar Rp " + new Intl.NumberFormat('id-ID').format(jumlah),
      icon: "success",
      confirmButtonText: "Oke",
    });
  }

  const notif = document.getElementById("notif-data");
  if (notif) {
    const message = notif.dataset.msg;
    Swal.fire({
      title: "Berhasil!",
      text: message,
      icon: "success",
      confirmButtonText: "OK",
    });
  }
});
