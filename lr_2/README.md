# Задания на лр 2.

1. Сформировать отчёт с информацией о 10 наиболее популярных языках программирования по итогам года за период с 2010 по 2020 годы.
   Отчёт будет отражать динамику изменения популярности языков программирования и представлять собой набор таблиц "топ-10" для каждого года.

- Загрузил данные
  
- Написал функцию фильтрации языка
  
  Функция принимает один аргумент `x`. Внутри функции определена переменная `tag`, которая ищет первый язык программирования
   из списка `languageList`, содержащийся в тегах (`_Tags`) объекта `x`.

- Написал функцию фильтрации по годам.
Функция принимает два аргумента: x и year.

`detectionYear`. Функция принимает два аргумента: `x` и `year`. 
функция проверяет, находится ли `x._CreationDate` (дата создания объекта `x`) в интервале от `start` до `end`. Если дата создания `x`
попадает в указанный интервал.

- Написал цикл для формирования отчета.
  
2. Получившийся отчёт сохранить в формате Apache Parquet.

- Написал цикл который прошелся по ключам в словаре, `selection_prog_language`. Создаю путь и сохраняю файл.

