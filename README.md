# Manejo de transaciones - Sring Boot

Entidad sera el nombre de nuestra clase dominio que se relaciona con una tabla en DB

1. se crea la interface con los metodos que queremos que se implementen EntidadService


2. creamos la clase con implements a EntidadService, y se marca la clase como @Service      para identificar que es un servicio, llamado EntidadServiceImpl


3. se agrega el atributo de tipo EntidadDao y se marca de como @Autowired


4. se agregan las clases correspondientes a cada query con ayuda del atributo Dao


5. se marca cada clase segun el tipo de metodo, para identifiacrlas como
   transaccionales y en caso de error estas hagan rollback y en caso de exito commit
   -cuando solo se leen datos es @Transactional(readOnly = true)
   -cuando se modifica informacion(create, update, delete) es @Transactional


6. en el controlador ya no inyectamos directamente Dao, si no la capa de servicio
   -se agrega un atributo de tipo EntidadService con su marcador @Autowired
