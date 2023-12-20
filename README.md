# Самигуллин Равиль гр. 6133-010402D
## big_data

## Ответы на Вопросы
### Где хранятся промежуточные данные Spark во время обработки?

Промежуточные данные Spark, созданные во время обработки, могут храниться в нескольких местах, в зависимости от настроек и конфигурации вашего приложения Spark.

1. **Memory (память)**: Spark может хранить промежуточные данные в оперативной памяти, что обеспечивает быстрый доступ к данным, особенно если они часто используются.

2. **Disk (диск)**: Когда доступная оперативная память недостаточна для хранения всех данных, Spark может хранить промежуточные данные на диске. Данные могут быть сохранены во временных файлах или блоках на диске, доступ к которым осуществляется по необходимости.

3. **External Storage (внешнее хранилище)**: Spark также может сохранять промежуточные данные во внешнем хранилище, таком как Hadoop Distributed File System (HDFS), Amazon S3, Apache Cassandra и другие. Это полезно в случаях, когда данные должны быть доступными между различными запусками приложения или на разных узлах кластера.

4. **Off-Heap (внешняя память)**: Spark может также использовать внешнюю (неподконтрольную JVM) память для хранения больших промежуточных данных. Это полезно, чтобы избежать переполнения памяти JVM, особенно при обработке больших объемов данных.

### Что такое Watermark в Apache Flink?

Watermark (водяной знак) в Apache Flink - это механизм для обработки задержек данных в потоковой обработке (stream processing) и установки границы времени для доступных данных.

Watermark представляет собой временную отметку, указывающую на завершение потока данных до определенного момента времени. Он указывает момент, после которого можно считать, что все данные с меньшим временным штампом пришли, и дальше можно выполнять агрегацию и обработку.

Watermark активно используется для решения проблемы задержки данных (data latency) в потоковой обработке.

### Какие задачи можно решать с помощью ZooKeeper?

1. Синхронизация: ZooKeeper обеспечивает механизм для синхронизации и координации распределенных процессов и узлов. Он позволяет управлять порядком выполнения операций и обеспечивает последовательное согласование между различными участниками системы.

2. Распределенная конфигурация: ZooKeeper может использоваться для хранения и распространения конфигурационных данных между узлами системы. Это позволяет обновлять и синхронизировать конфигурацию на всех узлах автоматически и централизованно.

3. Обнаружение и управление сервисами: ZooKeeper может использоваться для обнаружения и отслеживания состояния сервисов в распределенной системе. Он предоставляет API для регистрации сервисов и отслеживания их доступности, позволяя обнаруживать новые сервисы и реагировать на изменения в составе их узлов.

4. Блокировки и семафоры: ZooKeeper предоставляет примитивы синхронизации, такие как блокировки и семафоры, которые могут быть использованы для координации доступа к ресурсам или выполнения определенных операций только одним узлом в распределенной системе.

5. Распределенные очереди: ZooKeeper позволяет создавать распределенные очереди, в которых процессы могут помещать элементы данных для последующей обработки. Такие очереди особенно полезны при масштабировании и балансировке нагрузки в распределенных системах.

6. Мониторинг и управление состоянием: ZooKeeper может быть использован для отслеживания и управления состоянием узлов и процессов в распределенной системе. Он предоставляет набор инструментов для мониторинга и управления такими данными, как журналы, статистика, состояние подключений и т. д.
