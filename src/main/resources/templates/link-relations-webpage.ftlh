<html>
<head>
  <title>${doc.title}</title>
</head>
<body>
  <h1>${doc.title}</h1>
  <p>${doc.description}</p>
  <table style="width:100%">
    <tr>
      <th>Name</th>
      <th>Description</th>
      <th>Reference</th>
      <th>Notes</th>
    </tr>
    <#list doc.linkRelations as relation>
        <tr>
          <th>${relation.name}</th>
          <th>${relation.description}</th>
          <th>${relation.reference}</th>
          <th>${relation.notes}</th>
        <th>
    </#list>
  </table>
</body>
</html>