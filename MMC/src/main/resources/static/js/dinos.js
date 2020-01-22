// Function that renders the list items from our records
function ulWriter(rowIndex, record, columns, cellWriter) {
    var cssClass = "span4", li;
    if (rowIndex % 3 === 0) { cssClass += ' first'; }
    li = '<li class="' + cssClass + '"><div class="thumbnail align-item-center" style="padding: 10px; border: 1px #6c757d solid; margin-right: 10px; background-color:#fff; max-width: 230px; max-height: 480px; height: 480px"><br><div class="thumbnail-image">' + record.thumbnail + '</div><div class="caption"><br>' + record.caption + '</div></div></li>';
    return li;
  }
  
  // Function that creates our records from the DOM when the page is loaded
  function ulReader(index, li, record) {
    var $li = $(li),
        $caption = $li.find('.caption');
    record.thumbnail = $li.find('.thumbnail-image').html();
    record.caption = $caption.html();
    record.label = $caption.find('h3').text();
    record.description = $caption.find('p').text();
    record.color = $li.data('color');
  }
  $('#ul-example').css("list-style-type","none");


  
  $('#ul-example').dynatable({
    table: {
      bodyRowSelector: 'li'
    },
    dataset: {
      perPageDefault: 3,
      perPageOptions: [3, 6]
    },
    writers: {
      _rowWriter: ulWriter
    },
    readers: {
      _rowReader: ulReader
    },
    params: {
      records: 'Registros'
    }
  
  });
  