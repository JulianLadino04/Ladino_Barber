package co.edu.uniquindio.peluqueria.dto;

public record ProductoStockDTO(
        String idProducto,
        String nombre,
        int cantidad,
        double precio) {
}
